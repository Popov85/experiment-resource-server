# Resource server demo: "new" resource server impl. called "DSL".

Here we do not use oauth2 cloud dependency!

Here we validate JWT token with a public key, but this time without wrapping lines.

`MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoAqepdMVt27BOmQZYcbP
 cfER4At8o74Yb0uOXhxQuVoHclF6MAYkzJ0eOvsbnmNh0mzyQk1woRLRbdxV4/B7
 E8W+zLODXtOTajy//UQww67ODW01Rg2F6WSMATc62/+bDOYcsUV4AZ3ux296wBSx
 F/fd/yvFmjwGbyPgZ62tXNkv4K2pCk4odatOyUkxyNr5JDXezn0x85Znd4iJt5hE
 TKDf0Ywd0LkfxPAKEdQcnSPycD/2Cr2gwGUD76iLQfH2AYCiwjdePgPZWYhUKimH
 oL8obVF0L3aTn2XZjaevObG8HEc3ab9+iqS0SrkVIR4Kk84X25nTBGnpuHmZMkv4
 2QIDAQAB`

Also, this impl. requires a run-time dependency:

```
<dependency>
     <groupId>com.nimbusds</groupId>
     <artifactId>nimbus-jose-jwt</artifactId>
     <version>8.19</version>
 </dependency>
```

This impl. compatible with keycloak etc.

This mean is preferred for using with new Spring auth server project!

For more details see
[YouTube](https://www.youtube.com/watch?v=2WzSreQc_m0&list=PLEocw3gLFc8XRaRBZkhBEZ_R3tmvfkWZz&index=21)