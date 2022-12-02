# Fancy Progressbar

Android library providing a beautiful progressbar with colorful shadow, gradient and animation for Jetpack Compose.

![License MIT](https://img.shields.io/badge/MIT-9E9F9F?style=flat-square&label=License)
![Android minimuml version](https://img.shields.io/badge/21+-9E9F9F?style=flat-square&label=Minimum&logo=android)

Download
--------
Add in project build.gradle:

```gradle
repositories {
    maven { url 'https://jitpack.io' }
}
// App build.gradle
dependencies {
    implementation 'com.github.fatemeh-afshari:fancy-progressbar:latestVersion'
}
```

## Usage
--------

```kotlin
FancyProgressbar(
    initialValue = 0f, // 0 to maxValue
    targetValue = 50f, // 0 to maxValue
    trackColor = Color(0xFFBFBFC0),
    indicatorColor = Brush.horizontalGradient(
        tileMode = TileMode.Clamp,
        colors = listOf(
            Color(0xFFE91E63),
            Color(0xFFF48FB1),
        )
    ),
    shadowColor = Color(0xFF7E57C2),
    radius = 16.dp,
    height = 16.dp,
    animationDuration = 3000,
    maxValue = 100f,
)
```

<img width="301" src="https://user-images.githubusercontent.com/67331684/205386545-36f31173-dd0b-4ee8-bb79-3a53085cc59f.png">

**Note:** see [Example](app/src/main/java/com/fancy/progressbar/MainActivity.kt) for more detail.

## License

```
   
The MIT License (MIT)

Copyright (c) 2022 Fatemeh Afshari

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

```

