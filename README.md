A smaller library with useful functional interfaces.

### Gradle

#### groovy
```groovy
repositories {
    maven {
        url = "https://maven.burgerbude.org/api/v1/maven/"
    }
}

dependencies {
    implementation "org.burgerbude:function:0.1.0"
}
```

#### kts
```kotlin
repositories {
    maven("https://maven.burgerbude.org/api/v1/maven/")
}

dependencies {
    implementation("org.burgerbude:function:0.1.0")
}
```

### Maven
```html
<repositores> 
    <repository>
        <id>Burgerbude</id>
        <url>https://maven.burgerbude.org/api/v1/maven/</url>
    </repository>
</repositores>

<dependencies>
    <dependency>
        <groupId>org.burgerbude</groupId>
        <artifactId>function</artifactId>
        <version>0.1.0</version>
    </dependency>
</dependencies>

```