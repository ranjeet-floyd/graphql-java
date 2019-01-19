# Simple Graphql in Java

## Run 
    mvn clean install ; mvn jetty:run
    go to => localhost:8080

## Graphql 
```
    mutation {
    createLink(url: "http:test.com", description: "test") {
        url
        description
    }
    }

    # {
    #   allLinks {
    #     url
    #     description
    #   }
    # }
```
