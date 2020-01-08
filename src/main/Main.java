package main;

import java.io.File;
import java.io.IOException;
import java.util.List;

import util.FileUtil;
import main.ASTGenerator;
import structure.MyMethodNode;

public class Main {
	
	/**
	 * given the path of a java program which you want to parse and the output directory
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		String FilePath = "/Users/Bowen/eclipse-workspace/javaparser/testdata/HelloWorld.java";
		String outputDir = "/Users/Bowen/eclipse-workspace/javaparser/output/";
		File f = new File(FilePath);
		ASTGenerator astGenerator = new ASTGenerator(f);
		List<MyMethodNode> methodNodeList = astGenerator.getMethodNodeList();
		for (MyMethodNode m : methodNodeList) {
			String dotStr = ASTtoDOT.ASTtoDotParser(m);
			FileUtil.writeFile(outputDir + f.getName() + "_" + m.methodNode.getName() + ".dot", dotStr);
		}
		System.out.println("Done.");
	}

}
