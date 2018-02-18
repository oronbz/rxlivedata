# RxLiveData
RxLiveData is a library of [LiveData](https://developer.android.com/topic/libraries/architecture/livedata.html) Kotlin extensions that provides some of the famous Rx ([Reactive Extensions](http://reactivex.io/)) operators like `filter`, `skip`, `take`, `withLatestFrom`, etc. on top of LiveData.

[![Release](https://jitpack.io/v/oronbz/rxlivedata.svg)](https://jitpack.io/#oronbz/rxlivedata)

## Download

Gradle:

```gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}

dependencies {
  compile 'com.github.oronbz:rxlivedata:0.0.2'
}
```

## Usage

### Example of `filterNull`, `filter` and `switchMap`
```kotlin
searchResults = query
        .filterNull()
        .filter { it.isNotBlank() }
        .switchMap {
          gitHubRepository.searchUsers(it)
        }.filterNull()
```

## List of supported operators
* `map`
* `switchMap`
* `filter` or `filterNullables` (if you work with nullables)
* `filterNull`
* `take`
* `skip`
* `merge`
* `withLatestFrom`
* More to come...

## License

    Copyright 2018 Oron Ben Zvi

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
