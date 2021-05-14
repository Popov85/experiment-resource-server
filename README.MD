# Resource server demo: client with SSO with GITHUB.

Here we do not use oauth2 cloud dependency again!

Instead, use this one:

```
 <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-oauth2-client</artifactId>
 </dependency>
```

Steps to undertake:

* Go to GitHub->setting->Developer Settings->OAuth Apps->New OAuth App
and specify its name, in return GitHub provides generate clientId and clientSecret

* Put these pair into the application.properties and try to call http://localhost:8090/
You will be redirected to GitHub, where you have to enter the credentials;
After successful auth. against GitHub, you will be redirected from there to the endpoint of your App that you specified during creating OAuth app in GitHub.


For more details see
[YouTube](https://www.youtube.com/watch?v=ApEVbx4Sz_k&list=PLEocw3gLFc8XRaRBZkhBEZ_R3tmvfkWZz&index=22)