# reasonphrase

Provides a lookup from HTTP Status Code to an HTTP Reason Phrase.

## Usage

```xml
<dependency>
    <groupId>dev.mccue</groupId>
    <artifactId>reasonphrase</artifactId>
    <version>1.0.0</version>
</dependency>
```

```java
import dev.mccue.reasonphrase.ReasonPhrase;

public class Main {
    public static void main(String[] args) {
        // OK
        System.out.println(ReasonPhrase.forStatus(200));
        
        // Not Found
        System.out.println(ReasonPhrase.forStatus(404));
    }
}
```