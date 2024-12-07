# quark-bug-tls

Environment variables are ignore for the tls registry.

To reproduce export the following variables:
```shell
export QUARKUS_TLS_MYTLS_KEY_STORE_P12_PASSWORD=changeit 
export QUARKUS_TLS_MYTLS_KEY_STORE_P12_PATH="$(pwd)/test.p12" 
```

Then run the app: `./gradlew qD`

If you query the endpoint `curl localhost:8080/test/hello` the keystore will be null, but the properties are well 
oaded by quarkus.

If you remove some the configMappings, and restart, the app will work fine.
Using system properties works correctly.