# RxLiveData
RxLiveData is a library of [LiveData](https://developer.android.com/topic/libraries/architecture/livedata.html) Kotlin extensions that provides some of the famous Rx ([Reactive Extensions](http://reactivex.io/)) operators like `filter`, `skip`, `take`, `withLatestFrom`, etc. on top of LiveData.

# Download

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

# Usage

## Example of `filterNull`, `filter` and `switchMap`
```kotlin
searchResults = query
        .filterNull()
        .filter { it.isNotBlank() }
        .switchMap {
          gitHubRepository.searchUsers(it)
        }.filterNull()
```

# List of supported operators
* `map`
* `switchMap`
* `filter` or `filterNullables` (if you work with nullables)
* `filterNull`
* `take`
* `skip`
* `merge`
* `withLatestFrom`
* More to come...
