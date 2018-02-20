# RxLiveData
RxLiveData is a library of [LiveData](https://developer.android.com/topic/libraries/architecture/livedata.html) Kotlin extensions that provides some of the famous Rx ([Reactive Extensions](http://reactivex.io/)) operators like `filter`, `skip`, `take`, `withLatestFrom`, etc. on top of LiveData.

[![Build Status](https://travis-ci.org/oronbz/rxlivedata.svg?branch=master)](https://travis-ci.org/oronbz/rxlivedata) 
[![Release](https://jitpack.io/v/oronbz/rxlivedata.svg)](https://jitpack.io/#oronbz/rxlivedata)

## Download

1. Add jitpack maven url to your root build.gradle at the end of repositories:

```gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```

2. Add the dependency to your app build.gradle:
```gradle
dependencies {
  compile 'com.github.oronbz:rxlivedata:0.0.3'
}
```

## Usage

### Example of `filterNull`, `filter`, `distinctUntilChanged`, `switchMap` and `map`
```kotlin
val query = MutableLiveData<String?>()

searchResults = query
        .filterNull()
        .filter { it.isNotBlank() }
        .distinctUntilChanged()
        .switchMap {
          gitHubRepository.searchUsers(it)
        }.filterNull()
        .map {
          it.users.map {
            SearchItemViewModel(it.username, it.avatarUrl)
          }
        }
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
* `distinctUntilChanged`
* `startWith`
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
