# Resource server demo: this example shows how to configure resource server to get public key from the expose endpoint t auth server

Now, we do not need to store public-key.pem in the resource folder of the resource server

This time we only configure these lines of application.properties:

// This is exactly the default endpoint auth server exposes

`security.oauth2.resource.jwt.key-uri=http://localhost:8080/oauth/token_key`
 
// This is exactly the credentials for this exposed endpoint, configures at auth server

`security.oauth2.client.client-id=client3`
`security.oauth2.client.client-secret=secret3`
 
 Warn! The resource server will no even start if auth server is not up and running!

For configuring auth server see
[GitHub](https://github.com/Popov85/experiment-auth-server/tree/expose-public-key-url)