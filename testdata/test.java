public class test {
	int i = 1;

	public void testNonEscaped() {
		startServer(NonEscapedURIResource.class);

		WebResource r = Client.create().resource(getUri().userInfo("x.y").path("x%20y").build());
		assertEquals("CONTENT", r.get(String.class));
	}
}