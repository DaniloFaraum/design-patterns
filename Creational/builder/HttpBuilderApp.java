package builder;

import java.net.http.HttpRequest.Version;

public class HttpBuilderApp {
	public static void main(String[] args) {
		HttpRequest.newBuilder()
		.uri("viacep.com.br/ws/06150000/json")
		.version(Version.HTTP_1_1)
		.GET()
		.build();
		
		HttpClient.newBuilder()
		.followRedirects(Redirect.ALWAYS)
		.build();
		
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		System.out.println();
	}
}
