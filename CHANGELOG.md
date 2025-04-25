# Changelog

## 0.1.0-alpha.12 (2025-04-25)

Full Changelog: [v0.1.0-alpha.11...v0.1.0-alpha.12](https://github.com/openlayer-ai/openlayer-java/compare/v0.1.0-alpha.11...v0.1.0-alpha.12)

### ⚠ BREAKING CHANGES

* **client:** refactor exception structure and methods ([#93](https://github.com/openlayer-ai/openlayer-java/issues/93))
* **client:** **Migration:** Previously you would access error JSON on an exception via `exception.error()._additionalProperties()`, which would return `Map<String, JsonValue>`. Now you would access this via `exception.body()`, which returns `JsonValue`. You should no longer assume that the returned error JSON is an object. You can check via `exception.body().asObject()`.
* **client:** move classes into subpackages and shorten names ([#80](https://github.com/openlayer-ai/openlayer-java/issues/80))

### Features

* **api:** add endpoint to retrieve commit by id ([#77](https://github.com/openlayer-ai/openlayer-java/issues/77)) ([5087297](https://github.com/openlayer-ai/openlayer-java/commit/50872978eab416d1395b8619b965e7135d2aef65))
* **api:** add test creation endpoint ([0282634](https://github.com/openlayer-ai/openlayer-java/commit/02826344cb144623d177771d5cc066490cbe9bb5))
* **api:** api update ([ded01c5](https://github.com/openlayer-ai/openlayer-java/commit/ded01c545f44e1372efeffd478fc02612172fdd6))
* **api:** api update ([afb521e](https://github.com/openlayer-ai/openlayer-java/commit/afb521e47092ec517327a7398a4a1f768f411e41))
* **api:** api update ([76afcb9](https://github.com/openlayer-ai/openlayer-java/commit/76afcb9b2d3f5ab89cd420cbdb084ab400ce5622))
* **api:** api update ([420f95c](https://github.com/openlayer-ai/openlayer-java/commit/420f95c52275d20441bce4bca05420b4dfd9e4ad))
* **api:** api update ([a18a3b0](https://github.com/openlayer-ai/openlayer-java/commit/a18a3b06d20f8c2d8414d0b1ce116d8bd5dad387))
* **api:** api update ([cedc29f](https://github.com/openlayer-ai/openlayer-java/commit/cedc29f79a787b41f0474355d38e2ef94c044123))
* **api:** expose test retrieval endpoint ([8fdd96d](https://github.com/openlayer-ai/openlayer-java/commit/8fdd96d6b76ffdbf24914b50cf5d57197bbcd1ab))
* **api:** expose test retrieval endpoint ([6a5c141](https://github.com/openlayer-ai/openlayer-java/commit/6a5c14163b155b89cc3225c28ae37d5d4d594bff))
* **api:** expose test update endpoint ([7ae882e](https://github.com/openlayer-ai/openlayer-java/commit/7ae882e19aca6c298a0184d135a4365b5148f3ce))
* **client:** add `close` method ([207ba78](https://github.com/openlayer-ai/openlayer-java/commit/207ba785d6409b4a6b5ede70f3944313cd625b6c))
* **client:** add enum validation method ([0c69b0d](https://github.com/openlayer-ai/openlayer-java/commit/0c69b0d67f818d7511495b196978e1d9a6f6de7d))
* **client:** expose request body setter and getter ([#106](https://github.com/openlayer-ai/openlayer-java/issues/106)) ([8725baa](https://github.com/openlayer-ai/openlayer-java/commit/8725baa3ddd8d7fe53c607cd9d2e7f14373b37df))
* **client:** make datetime deserialization more lenient ([#105](https://github.com/openlayer-ai/openlayer-java/issues/105)) ([ac0fa47](https://github.com/openlayer-ai/openlayer-java/commit/ac0fa470239a5ad32e3d372354f63da231a98480))
* **client:** make union deserialization more robust ([#104](https://github.com/openlayer-ai/openlayer-java/issues/104)) ([0c69b0d](https://github.com/openlayer-ai/openlayer-java/commit/0c69b0d67f818d7511495b196978e1d9a6f6de7d))
* **client:** support a lower jackson version ([#99](https://github.com/openlayer-ai/openlayer-java/issues/99)) ([86e9363](https://github.com/openlayer-ai/openlayer-java/commit/86e936338872071e1dcc80f0549adcb21f8aa205))
* **client:** support setting base URL via env var ([08e6ac1](https://github.com/openlayer-ai/openlayer-java/commit/08e6ac1c7327d8c832035b29242b10c8678f2543))
* **client:** throw on incompatible jackson version ([86e9363](https://github.com/openlayer-ai/openlayer-java/commit/86e936338872071e1dcc80f0549adcb21f8aa205))


### Bug Fixes

* **client:** bump to better jackson version ([fc11f45](https://github.com/openlayer-ai/openlayer-java/commit/fc11f45df797c93281e670e35ecd00c6530d0af4))
* **client:** don't call `validate()` during deserialization if we don't have to ([#101](https://github.com/openlayer-ai/openlayer-java/issues/101)) ([5ce9c06](https://github.com/openlayer-ai/openlayer-java/commit/5ce9c0686bbf66a4f0e3e2acad3356664671d287))
* **client:** limit json deserialization coercion ([#102](https://github.com/openlayer-ai/openlayer-java/issues/102)) ([15fddc3](https://github.com/openlayer-ai/openlayer-java/commit/15fddc34beea081f9afb69dc87302b65c1e82340))
* **client:** make some classes and constructors non-public ([882eb61](https://github.com/openlayer-ai/openlayer-java/commit/882eb61286bb52c15224a36677a934523ccb4fb3))
* **client:** map deserialization bug ([17fc1d7](https://github.com/openlayer-ai/openlayer-java/commit/17fc1d796ea7b17d34c0b14374fff3420a14397e))
* **client:** return `Optional&lt;T&gt;` instead of `Optional<? extends T>` ([#109](https://github.com/openlayer-ai/openlayer-java/issues/109)) ([c2c1501](https://github.com/openlayer-ai/openlayer-java/commit/c2c150161ea17067c68e3ce7c54deebdf2461c4a))
* **client:** support kotlin 1.8 runtime ([#90](https://github.com/openlayer-ai/openlayer-java/issues/90)) ([f2b112b](https://github.com/openlayer-ai/openlayer-java/commit/f2b112b2f218ba39307aad1ed17c0d6114142d3a))
* pluralize `list` response variables ([#103](https://github.com/openlayer-ai/openlayer-java/issues/103)) ([c1cde72](https://github.com/openlayer-ai/openlayer-java/commit/c1cde726f563abe38a5188647c6f05df01d034e8))


### Performance Improvements

* **client:** cached parsed type in `HttpResponseFor` ([#107](https://github.com/openlayer-ai/openlayer-java/issues/107)) ([3bd7a4c](https://github.com/openlayer-ai/openlayer-java/commit/3bd7a4cc174f22a5e2ef4510ee1576563ad608c2))
* **internal:** improve compilation+test speed ([e2aafa7](https://github.com/openlayer-ai/openlayer-java/commit/e2aafa770f685aed27c842b1c7c6e61258d967b3))


### Chores

* **ci:** add timeout thresholds for CI jobs ([cdf2938](https://github.com/openlayer-ai/openlayer-java/commit/cdf29389f0d198ea0dca008e0f235bfbeec1327b))
* **ci:** only use depot for staging repos ([2cb59ec](https://github.com/openlayer-ai/openlayer-java/commit/2cb59ec3924c68c6d7faa97fbbbccd6d3489f3fd))
* **client:** move classes into subpackages and shorten names ([#80](https://github.com/openlayer-ai/openlayer-java/issues/80)) ([6e35cbf](https://github.com/openlayer-ai/openlayer-java/commit/6e35cbf67eab70e90be376b4835a9b000f265cf9))
* **client:** refactor exception structure and methods ([#93](https://github.com/openlayer-ai/openlayer-java/issues/93)) ([d1ee889](https://github.com/openlayer-ai/openlayer-java/commit/d1ee889f1b5a4b8e97fff690f0c4db997441278f))
* **client:** remove unnecessary json state from some query param classes ([0c69b0d](https://github.com/openlayer-ai/openlayer-java/commit/0c69b0d67f818d7511495b196978e1d9a6f6de7d))
* **internal:** add invalid json deserialization tests ([0c69b0d](https://github.com/openlayer-ai/openlayer-java/commit/0c69b0d67f818d7511495b196978e1d9a6f6de7d))
* **internal:** add json roundtripping tests ([0c69b0d](https://github.com/openlayer-ai/openlayer-java/commit/0c69b0d67f818d7511495b196978e1d9a6f6de7d))
* **internal:** add missing release please block ([#92](https://github.com/openlayer-ai/openlayer-java/issues/92)) ([722165b](https://github.com/openlayer-ai/openlayer-java/commit/722165bcfa13936fc3ed70592833293495f1ed20))
* **internal:** codegen related update ([caff21a](https://github.com/openlayer-ai/openlayer-java/commit/caff21a6eabf0cc2386ebb707023a0bcbac0fd35))
* **internal:** codegen related update ([c23eea2](https://github.com/openlayer-ai/openlayer-java/commit/c23eea21cd8a3895c7ed616998516df64ac1b9dd))
* **internal:** codegen related update ([2885a5a](https://github.com/openlayer-ai/openlayer-java/commit/2885a5a402fa4cea4e5363a5dbec1bd255a9060b))
* **internal:** codegen related update ([a62fb1f](https://github.com/openlayer-ai/openlayer-java/commit/a62fb1f2042721f6ce4eb84ff33bfd9704829266))
* **internal:** codegen related update ([ca04676](https://github.com/openlayer-ai/openlayer-java/commit/ca0467688568fe952dc57739c6306209f68761f8))
* **internal:** codegen related update ([#79](https://github.com/openlayer-ai/openlayer-java/issues/79)) ([3ee21d4](https://github.com/openlayer-ai/openlayer-java/commit/3ee21d4a05dddebac33326fd9c0cbde11bf39062))
* **internal:** codegen related update ([#85](https://github.com/openlayer-ai/openlayer-java/issues/85)) ([3d4d199](https://github.com/openlayer-ai/openlayer-java/commit/3d4d19974440297e5b1f4fdd220ae2c29adfad00))
* **internal:** delete duplicate tests ([ece3d6d](https://github.com/openlayer-ai/openlayer-java/commit/ece3d6d3f438671e2b4fab916f9295c668d2f137))
* **internal:** delete unused methods and annotations ([#100](https://github.com/openlayer-ai/openlayer-java/issues/100)) ([17fc1d7](https://github.com/openlayer-ai/openlayer-java/commit/17fc1d796ea7b17d34c0b14374fff3420a14397e))
* **internal:** expand CI branch coverage ([273f4a7](https://github.com/openlayer-ai/openlayer-java/commit/273f4a712c63235e663b5e2ddba53797f2cf441c))
* **internal:** fix example formatting ([#95](https://github.com/openlayer-ai/openlayer-java/issues/95)) ([5c782e5](https://github.com/openlayer-ai/openlayer-java/commit/5c782e5d75daafb3eea58bbe5c834a3cf3444783))
* **internal:** generate more tests ([db068dc](https://github.com/openlayer-ai/openlayer-java/commit/db068dc6e79b6a3fa77fe7b22a9a7bf31b61b8d9))
* **internal:** java 17 -&gt; 21 on ci ([7bcb837](https://github.com/openlayer-ai/openlayer-java/commit/7bcb837a326dc585fae7b88c8f104243d936b20a))
* **internal:** make multipart assertions more robust ([ac5dc3b](https://github.com/openlayer-ai/openlayer-java/commit/ac5dc3bb775247428b484019d4f5a936877dac0e))
* **internal:** reduce CI branch coverage ([3169980](https://github.com/openlayer-ai/openlayer-java/commit/3169980b67081c80cadb5af4869982a2a3eadedd))
* **internal:** refactor `ErrorHandlingTest` ([2fca9f1](https://github.com/openlayer-ai/openlayer-java/commit/2fca9f1dbdc492be75166cc9727660dffd325ce8))
* **internal:** refactor enum query param serialization ([#91](https://github.com/openlayer-ai/openlayer-java/issues/91)) ([b928602](https://github.com/openlayer-ai/openlayer-java/commit/b92860288151baab73f6ad26ffbd0976a3f54aab))
* **internal:** refactor query param serialization impl and tests ([#87](https://github.com/openlayer-ai/openlayer-java/issues/87)) ([301bc32](https://github.com/openlayer-ai/openlayer-java/commit/301bc32db49ad7d0b417b98996f11ed445c2501c))
* **internal:** refactor some test assertions ([ece3d6d](https://github.com/openlayer-ai/openlayer-java/commit/ece3d6d3f438671e2b4fab916f9295c668d2f137))
* **internal:** reformat some tests ([#89](https://github.com/openlayer-ai/openlayer-java/issues/89)) ([db068dc](https://github.com/openlayer-ai/openlayer-java/commit/db068dc6e79b6a3fa77fe7b22a9a7bf31b61b8d9))
* **internal:** remove extra empty newlines ([#81](https://github.com/openlayer-ai/openlayer-java/issues/81)) ([9eba32c](https://github.com/openlayer-ai/openlayer-java/commit/9eba32cbaa34b9c97ac7efd81533066229470ea5))
* **internal:** remove some unnecessary `constructor` keywords ([882eb61](https://github.com/openlayer-ai/openlayer-java/commit/882eb61286bb52c15224a36677a934523ccb4fb3))
* **internal:** remove unnecessary `assertNotNull` calls ([ac5dc3b](https://github.com/openlayer-ai/openlayer-java/commit/ac5dc3bb775247428b484019d4f5a936877dac0e))
* **internal:** remove unnecessary import ([#96](https://github.com/openlayer-ai/openlayer-java/issues/96)) ([4852f0f](https://github.com/openlayer-ai/openlayer-java/commit/4852f0fc5face081a9d899a940ac15ee771df2e4))
* **internal:** remove workflow ([54e8c73](https://github.com/openlayer-ai/openlayer-java/commit/54e8c738a650f838cdc25c71ad355c17b6b23867))
* **internal:** rename `getPathParam` ([#88](https://github.com/openlayer-ai/openlayer-java/issues/88)) ([ece3d6d](https://github.com/openlayer-ai/openlayer-java/commit/ece3d6d3f438671e2b4fab916f9295c668d2f137))
* **internal:** reorder some params methodsc ([ece3d6d](https://github.com/openlayer-ai/openlayer-java/commit/ece3d6d3f438671e2b4fab916f9295c668d2f137))
* **internal:** swap from `getNullable` to `getOptional` ([#108](https://github.com/openlayer-ai/openlayer-java/issues/108)) ([3975381](https://github.com/openlayer-ai/openlayer-java/commit/3975381f2e6a9183a11200ca5a2e1ff5a260e784))
* **internal:** version bump ([4937ab9](https://github.com/openlayer-ai/openlayer-java/commit/4937ab9a3d67bdb756b8632dd934d4330e3b6f5a))
* **tests:** improve enum examples ([#111](https://github.com/openlayer-ai/openlayer-java/issues/111)) ([b8c855b](https://github.com/openlayer-ai/openlayer-java/commit/b8c855b09d13118ca76e7c053f5a1c76f33c4640))


### Documentation

* `async` and `sync` method comments ([0083c41](https://github.com/openlayer-ai/openlayer-java/commit/0083c41a6cc82a368e64ec0a812935597fa330e5))
* add `build` method comments ([#86](https://github.com/openlayer-ai/openlayer-java/issues/86)) ([e6da0bf](https://github.com/openlayer-ai/openlayer-java/commit/e6da0bfc278f0405e7a875e53574abff11033bea))
* add client documentation ([ad4f217](https://github.com/openlayer-ai/openlayer-java/commit/ad4f217728a1fc01dacc4587004a086350f4ccc4))
* add comments to `JsonField` classes ([c2c1501](https://github.com/openlayer-ai/openlayer-java/commit/c2c150161ea17067c68e3ce7c54deebdf2461c4a))
* builder, enum, and union comments ([5f394f5](https://github.com/openlayer-ai/openlayer-java/commit/5f394f52f0d57b38f9664f135e58fa89f98a19d5))
* **client:** update jackson compat error message ([33c7cf9](https://github.com/openlayer-ai/openlayer-java/commit/33c7cf90367555a55d05077d2846745cc6b0983d))
* deduplicate and refine comments ([#84](https://github.com/openlayer-ai/openlayer-java/issues/84)) ([687dd63](https://github.com/openlayer-ai/openlayer-java/commit/687dd630eed0499e0b786c0df214c8671ae43402))
* document how to forcibly omit required field ([f7bf9f7](https://github.com/openlayer-ai/openlayer-java/commit/f7bf9f790253baaf2b8f9a192eac238db160e62b))
* explain http client customization ([5e6f544](https://github.com/openlayer-ai/openlayer-java/commit/5e6f54455db9a5a6ff8b9f5c7884813c17e57a0b))
* explain jackson compat in readme ([574dcea](https://github.com/openlayer-ai/openlayer-java/commit/574dcea5c0841a33730b45f935393f5a21355c96))
* minor readme tweak ([#98](https://github.com/openlayer-ai/openlayer-java/issues/98)) ([dd9ea15](https://github.com/openlayer-ai/openlayer-java/commit/dd9ea155bb0a7f67ab500de13ee44def664d253e))
* refine comments on multipart params ([#94](https://github.com/openlayer-ai/openlayer-java/issues/94)) ([ac5dc3b](https://github.com/openlayer-ai/openlayer-java/commit/ac5dc3bb775247428b484019d4f5a936877dac0e))
* swap examples used in readme ([#110](https://github.com/openlayer-ai/openlayer-java/issues/110)) ([f7bf9f7](https://github.com/openlayer-ai/openlayer-java/commit/f7bf9f790253baaf2b8f9a192eac238db160e62b))
* update documentation links to be more uniform ([c2b3e9d](https://github.com/openlayer-ai/openlayer-java/commit/c2b3e9d3b77d6b7b0d5aadf6a5141fb4f00a47bc))
* update readme exception docs ([#97](https://github.com/openlayer-ai/openlayer-java/issues/97)) ([7eafb98](https://github.com/openlayer-ai/openlayer-java/commit/7eafb987ad975163a4bda700271c3c752f6b4430))

## 0.1.0-alpha.11 (2024-12-20)

Full Changelog: [v0.1.0-alpha.10...v0.1.0-alpha.11](https://github.com/openlayer-ai/openlayer-java/compare/v0.1.0-alpha.10...v0.1.0-alpha.11)

### Features

* **api:** api update ([#68](https://github.com/openlayer-ai/openlayer-java/issues/68)) ([679ff1c](https://github.com/openlayer-ai/openlayer-java/commit/679ff1c2cd70530e6429d31766e1cad6165a7f6d))


### Chores

* **docs:** add example project ([#71](https://github.com/openlayer-ai/openlayer-java/issues/71)) ([7efeda9](https://github.com/openlayer-ai/openlayer-java/commit/7efeda9e63ec09ca07ec18e1647f4353ada3d218))
* **docs:** add example project ([#75](https://github.com/openlayer-ai/openlayer-java/issues/75)) ([3c48537](https://github.com/openlayer-ai/openlayer-java/commit/3c485375542ec9c8f8daf996bf436c0e50773149))
* **docs:** update readme ([#70](https://github.com/openlayer-ai/openlayer-java/issues/70)) ([91e2007](https://github.com/openlayer-ai/openlayer-java/commit/91e2007f4938d80ce30cc54651612e7d00ceda78))
* **docs:** update readme ([#73](https://github.com/openlayer-ai/openlayer-java/issues/73)) ([1f3da27](https://github.com/openlayer-ai/openlayer-java/commit/1f3da279ac393c8d077d21b1605cb28e398fff8e))
* **internal:** codegen related update ([#72](https://github.com/openlayer-ai/openlayer-java/issues/72)) ([029360f](https://github.com/openlayer-ai/openlayer-java/commit/029360f548e14f460168b7a0fe79e8914d7bfa48))
* **internal:** codegen related update ([#74](https://github.com/openlayer-ai/openlayer-java/issues/74)) ([2561984](https://github.com/openlayer-ai/openlayer-java/commit/2561984b26c0b220318ef21c2201cb1b96702e29))

## 0.1.0-alpha.10 (2024-12-13)

Full Changelog: [v0.1.0-alpha.9...v0.1.0-alpha.10](https://github.com/openlayer-ai/openlayer-java/compare/v0.1.0-alpha.9...v0.1.0-alpha.10)

### Chores

* **internal:** codegen related update ([#66](https://github.com/openlayer-ai/openlayer-java/issues/66)) ([0a31936](https://github.com/openlayer-ai/openlayer-java/commit/0a319360b98f225d92d3fc31ad49db5eed2b88e7))
* **internal:** remove unused imports ([#65](https://github.com/openlayer-ai/openlayer-java/issues/65)) ([cfb5af8](https://github.com/openlayer-ai/openlayer-java/commit/cfb5af80bc1435706e38760b5448dd079036edf7))
* update example values in tests and docs ([#61](https://github.com/openlayer-ai/openlayer-java/issues/61)) ([4737582](https://github.com/openlayer-ai/openlayer-java/commit/4737582a254bb1ae0d9905394c3cb550552b3286))


### Styles

* **internal:** make enum value definitions less verbose ([#63](https://github.com/openlayer-ai/openlayer-java/issues/63)) ([445cf02](https://github.com/openlayer-ai/openlayer-java/commit/445cf0268a084c9d27f47004fc22a8d6fcfa34e9))
* **internal:** move enum identity methods to bottom of class ([#64](https://github.com/openlayer-ai/openlayer-java/issues/64)) ([1be25e8](https://github.com/openlayer-ai/openlayer-java/commit/1be25e83f73636cca43eb945223b78ff2eb94849))

## 0.1.0-alpha.9 (2024-12-11)

Full Changelog: [v0.1.0-alpha.8...v0.1.0-alpha.9](https://github.com/openlayer-ai/openlayer-java/compare/v0.1.0-alpha.8...v0.1.0-alpha.9)

### Chores

* **internal:** codegen related update ([#58](https://github.com/openlayer-ai/openlayer-java/issues/58)) ([b646e7f](https://github.com/openlayer-ai/openlayer-java/commit/b646e7f3e75d9f352edc475f05ad272e548b20f7))

## 0.1.0-alpha.8 (2024-11-25)

Full Changelog: [v0.1.0-alpha.7...v0.1.0-alpha.8](https://github.com/openlayer-ai/openlayer-java/compare/v0.1.0-alpha.7...v0.1.0-alpha.8)

### Features

* **client:** add logging when debug env is set ([#56](https://github.com/openlayer-ai/openlayer-java/issues/56)) ([9d81162](https://github.com/openlayer-ai/openlayer-java/commit/9d811622736492e0eeea4d4acde518a6a2319b21))


### Chores

* **internal:** codegen related update ([#54](https://github.com/openlayer-ai/openlayer-java/issues/54)) ([4794b46](https://github.com/openlayer-ai/openlayer-java/commit/4794b465e2893768f1763cf2254c6f8aba909fdf))

## 0.1.0-alpha.7 (2024-11-21)

Full Changelog: [v0.1.0-alpha.6...v0.1.0-alpha.7](https://github.com/openlayer-ai/openlayer-java/compare/v0.1.0-alpha.6...v0.1.0-alpha.7)

### Chores

* **internal:** codegen related update ([#52](https://github.com/openlayer-ai/openlayer-java/issues/52)) ([224921d](https://github.com/openlayer-ai/openlayer-java/commit/224921d231f065fe66c42ab53fce59a8d0efbde0))
* rebuild project due to codegen change ([#50](https://github.com/openlayer-ai/openlayer-java/issues/50)) ([49217e1](https://github.com/openlayer-ai/openlayer-java/commit/49217e1b55888fd18cd1ac1979036450e290a6f4))

## 0.1.0-alpha.6 (2024-11-14)

Full Changelog: [v0.1.0-alpha.5...v0.1.0-alpha.6](https://github.com/openlayer-ai/openlayer-java/compare/v0.1.0-alpha.5...v0.1.0-alpha.6)

### Chores

* rebuild project due to codegen change ([#47](https://github.com/openlayer-ai/openlayer-java/issues/47)) ([a16074e](https://github.com/openlayer-ai/openlayer-java/commit/a16074e4a570b45e2d8b00f6a7931dc3566ada83))

## 0.1.0-alpha.5 (2024-11-11)

Full Changelog: [v0.1.0-alpha.4...v0.1.0-alpha.5](https://github.com/openlayer-ai/openlayer-java/compare/v0.1.0-alpha.4...v0.1.0-alpha.5)

### Features

* **api:** manual updates ([#42](https://github.com/openlayer-ai/openlayer-java/issues/42)) ([90b8621](https://github.com/openlayer-ai/openlayer-java/commit/90b8621b2a9cd61dac108272689fd0ac91892e98))
* **api:** manual updates ([#43](https://github.com/openlayer-ai/openlayer-java/issues/43)) ([197d1e4](https://github.com/openlayer-ai/openlayer-java/commit/197d1e408bb880f11dde24d4af04b0b6102a05cd))
* **api:** update via SDK Studio ([#40](https://github.com/openlayer-ai/openlayer-java/issues/40)) ([d739c0c](https://github.com/openlayer-ai/openlayer-java/commit/d739c0cf10da747b6116db07064f4211e138fbca))
* **api:** update via SDK Studio ([#41](https://github.com/openlayer-ai/openlayer-java/issues/41)) ([115a8bb](https://github.com/openlayer-ai/openlayer-java/commit/115a8bb76b4cc1deb9abccd7ff9341c9e7507db2))


### Bug Fixes

* update stream data example ([01a6acb](https://github.com/openlayer-ai/openlayer-java/commit/01a6acb859853b961556dcc7e51b91a40def3461))


### Chores

* custom code changes ([#44](https://github.com/openlayer-ai/openlayer-java/issues/44)) ([d1a94e9](https://github.com/openlayer-ai/openlayer-java/commit/d1a94e9d34778ca922ce580a0d887201881114ee))
* rebuild project due to codegen change ([#45](https://github.com/openlayer-ai/openlayer-java/issues/45)) ([546951e](https://github.com/openlayer-ai/openlayer-java/commit/546951ef157f61e22168e8bc3caee9e437c27a53))

## 0.1.0-alpha.4 (2024-09-23)

Full Changelog: [v0.1.0-alpha.3...v0.1.0-alpha.4](https://github.com/openlayer-ai/openlayer-java/compare/v0.1.0-alpha.3...v0.1.0-alpha.4)

### Features

* **api:** OpenAPI spec update via Stainless API ([#36](https://github.com/openlayer-ai/openlayer-java/issues/36)) ([5d56754](https://github.com/openlayer-ai/openlayer-java/commit/5d56754e57ac66410dba08160d168cc2f9e1d6d6))

## 0.1.0-alpha.3 (2024-08-22)

Full Changelog: [v0.1.0-alpha.2...v0.1.0-alpha.3](https://github.com/openlayer-ai/openlayer-java/compare/v0.1.0-alpha.2...v0.1.0-alpha.3)

### Features

* **api:** update via SDK Studio ([#32](https://github.com/openlayer-ai/openlayer-java/issues/32)) ([2888737](https://github.com/openlayer-ai/openlayer-java/commit/2888737a8d729c74ea0c1e98f99eff9b1891af2c))


### Bug Fixes

* **docs:** use correct putAdditionalProperty value ([#33](https://github.com/openlayer-ai/openlayer-java/issues/33)) ([a5b56f8](https://github.com/openlayer-ai/openlayer-java/commit/a5b56f873a197293df6b73134070544269e37711))

## 0.1.0-alpha.2 (2024-08-15)

Full Changelog: [v0.1.0-alpha.1...v0.1.0-alpha.2](https://github.com/openlayer-ai/openlayer-java/compare/v0.1.0-alpha.1...v0.1.0-alpha.2)

### Features

* **api:** OpenAPI spec update via Stainless API ([f3a2e94](https://github.com/openlayer-ai/openlayer-java/commit/f3a2e94096f7065baaf412330b4d82098144a7c6))
* **api:** OpenAPI spec update via Stainless API ([#13](https://github.com/openlayer-ai/openlayer-java/issues/13)) ([3d51770](https://github.com/openlayer-ai/openlayer-java/commit/3d51770cd80a882159c7bd267ebb4b1f82e1bbf2))
* **api:** OpenAPI spec update via Stainless API ([#16](https://github.com/openlayer-ai/openlayer-java/issues/16)) ([700e5dd](https://github.com/openlayer-ai/openlayer-java/commit/700e5dd17a46e547f1a2433993bbb4b586ae2159))
* **api:** OpenAPI spec update via Stainless API ([#22](https://github.com/openlayer-ai/openlayer-java/issues/22)) ([57cd9b9](https://github.com/openlayer-ai/openlayer-java/commit/57cd9b93d5cc5a955a2ca30136e53fcbc0db3fe1))
* **api:** OpenAPI spec update via Stainless API ([#8](https://github.com/openlayer-ai/openlayer-java/issues/8)) ([8edaa4b](https://github.com/openlayer-ai/openlayer-java/commit/8edaa4b24bf2b90d987ed7f64d2f789016f0f2ef))
* **api:** OpenAPI spec update via Stainless API ([#9](https://github.com/openlayer-ai/openlayer-java/issues/9)) ([69c5aba](https://github.com/openlayer-ai/openlayer-java/commit/69c5aba6d450e4a924a1ec1bf8f427cd66ba29a0))
* **api:** update via SDK Studio ([#10](https://github.com/openlayer-ai/openlayer-java/issues/10)) ([75a4d98](https://github.com/openlayer-ai/openlayer-java/commit/75a4d984832a11a4561b7b45ef1667dad6e8bd0a))
* **api:** update via SDK Studio ([#14](https://github.com/openlayer-ai/openlayer-java/issues/14)) ([b5ecd1c](https://github.com/openlayer-ai/openlayer-java/commit/b5ecd1cffeec8cc90c8fc37eb86d270671adcc73))
* **api:** update via SDK Studio ([#15](https://github.com/openlayer-ai/openlayer-java/issues/15)) ([ca3563b](https://github.com/openlayer-ai/openlayer-java/commit/ca3563b438c684f30bdc57fe95bd0bee33a0b201))
* **api:** update via SDK Studio ([#21](https://github.com/openlayer-ai/openlayer-java/issues/21)) ([b3df178](https://github.com/openlayer-ai/openlayer-java/commit/b3df178a8dba68759f3e9146c32ab2b52afa07a4))
* **api:** update via SDK Studio ([#23](https://github.com/openlayer-ai/openlayer-java/issues/23)) ([656bca9](https://github.com/openlayer-ai/openlayer-java/commit/656bca961e35da983260b1f6e5b3117d97bfebcf))
* **api:** update via SDK Studio ([#24](https://github.com/openlayer-ai/openlayer-java/issues/24)) ([1166c1b](https://github.com/openlayer-ai/openlayer-java/commit/1166c1beeda0ba4d25c01820cd3646c14555491c))
* **api:** update via SDK Studio ([#27](https://github.com/openlayer-ai/openlayer-java/issues/27)) ([9ed736f](https://github.com/openlayer-ai/openlayer-java/commit/9ed736f97e978d70402de098e6ba131057e0d080))
* **api:** update via SDK Studio ([#5](https://github.com/openlayer-ai/openlayer-java/issues/5)) ([f01f468](https://github.com/openlayer-ai/openlayer-java/commit/f01f468c2b6a0521a5f67bf7715d9d1e68eab49c))
* **api:** update via SDK Studio ([#7](https://github.com/openlayer-ai/openlayer-java/issues/7)) ([8c4398e](https://github.com/openlayer-ai/openlayer-java/commit/8c4398ed39212e1e018729727d7dfbe70a8db27d))


### Chores

* **ci:** limit release doctor target branches ([#17](https://github.com/openlayer-ai/openlayer-java/issues/17)) ([ef0d7e9](https://github.com/openlayer-ai/openlayer-java/commit/ef0d7e9c91d7798039e01600b762b13f1f5ada23))
* go live ([#6](https://github.com/openlayer-ai/openlayer-java/issues/6)) ([30ba342](https://github.com/openlayer-ai/openlayer-java/commit/30ba3429a02384007ec45e95db462a07d6a8e892))
* **internal:** codegen related update ([#18](https://github.com/openlayer-ai/openlayer-java/issues/18)) ([ff15d61](https://github.com/openlayer-ai/openlayer-java/commit/ff15d6179d277e41ab1910b69e90e49323530e3b))
* **internal:** refactor release doctor script ([#19](https://github.com/openlayer-ai/openlayer-java/issues/19)) ([6ce88ff](https://github.com/openlayer-ai/openlayer-java/commit/6ce88ff0c6f47bc4ae9d64e97dfedccc98edc5f7))
* **internal:** restore release-please configuration files ([#26](https://github.com/openlayer-ai/openlayer-java/issues/26)) ([a309673](https://github.com/openlayer-ai/openlayer-java/commit/a309673d5c7e72df8b006156d5458570d251995e))
* **internal:** version bump ([#3](https://github.com/openlayer-ai/openlayer-java/issues/3)) ([2e46974](https://github.com/openlayer-ai/openlayer-java/commit/2e46974aefcd77a33417b3d675bea14ccb95befd))
* **tests:** update prism version ([#25](https://github.com/openlayer-ai/openlayer-java/issues/25)) ([67bc5ea](https://github.com/openlayer-ai/openlayer-java/commit/67bc5ea91b7b482e09c8e4ccbbd544185e221a10))

## 0.1.0-alpha.1 (2024-06-24)

Full Changelog: [v0.0.1-alpha.0...v0.1.0-alpha.1](https://github.com/openlayer-ai/openlayer-java/compare/v0.0.1-alpha.0...v0.1.0-alpha.1)

### Features

* **api:** update via SDK Studio ([#1](https://github.com/openlayer-ai/openlayer-java/issues/1)) ([6cb7408](https://github.com/openlayer-ai/openlayer-java/commit/6cb740885ec6cc7d489d2235473c6c412811d406))
