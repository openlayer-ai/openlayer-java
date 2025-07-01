# Changelog

## 0.1.0-alpha.12 (2025-07-01)

Full Changelog: [v0.1.0-alpha.11...v0.1.0-alpha.12](https://github.com/openlayer-ai/openlayer-java/compare/v0.1.0-alpha.11...v0.1.0-alpha.12)

### ⚠ BREAKING CHANGES

* **client:** extract auto pagination to shared classes
* **client:** **Migration:** - If you were referencing the `AutoPager` class on a specific `*Page` or `*PageAsync` type, then you should instead reference the shared `AutoPager` and `AutoPagerAsync` types, under the `core` package
    - `AutoPagerAsync` now has different usage. You can call `.subscribe(...)` on the returned object instead to get called back each page item. You can also call `onCompleteFuture()` to get a future that completes when all items have been processed. Finally, you can call `.close()` on the returned object to stop auto-paginating early
    - If you were referencing `getNextPage` or `getNextPageParams`:
       - Swap to `nextPage()` and `nextPageParams()`
       - Note that these both now return non-optional types (use `hasNextPage()` before calling these, since they will throw if it's impossible to get another page)

### Features

* **client:** add a `withOptions` method ([9ebe803](https://github.com/openlayer-ai/openlayer-java/commit/9ebe803f62861554fbd7ca411e05642b69efb6df))
* **client:** allow providing some params positionally ([134e615](https://github.com/openlayer-ai/openlayer-java/commit/134e61553124243d105b41cfc2cfbd886dce4e63))
* **client:** extract auto pagination to shared classes ([d2fa723](https://github.com/openlayer-ai/openlayer-java/commit/d2fa72386ce83cb182c3d710ef25cd9b4b84bd99))
* **client:** implement per-endpoint base URL support ([710b626](https://github.com/openlayer-ai/openlayer-java/commit/710b6268e378ea59f4d0f06f3610e674f9c26073))


### Bug Fixes

* **ci:** release-doctor — report correct token name ([6e8b2be](https://github.com/openlayer-ai/openlayer-java/commit/6e8b2beecbc54b1b42e8b4e5c5fa1057f9f590af))
* **client:** bump max requests per host to max requests (5 -&gt; 64) ([21777c4](https://github.com/openlayer-ai/openlayer-java/commit/21777c4bfcec0adcd1b413f200c6fd1f45034c02))
* **client:** don't close client on `withOptions` usage when original is gc'd ([2595481](https://github.com/openlayer-ai/openlayer-java/commit/2595481dda4cc0ed639196deeed2683cb6a39e75))
* **client:** remove `@MustBeClosed` for future returning methods ([0e78fa9](https://github.com/openlayer-ai/openlayer-java/commit/0e78fa9dad3bc45d3aa173a446b1a07cd418bfc1))


### Chores

* **ci:** enable for pull requests ([5d83cd2](https://github.com/openlayer-ai/openlayer-java/commit/5d83cd2b8cb48f8459c495cc4385a6966ffde4ed))
* **ci:** only run for pushes and fork pull requests ([69737c8](https://github.com/openlayer-ai/openlayer-java/commit/69737c8645e346ded3bad84344e93fe75ac38396))
* **docs:** grammar improvements ([d1cacea](https://github.com/openlayer-ai/openlayer-java/commit/d1cacea72d2b3f2de5d20028b2c5227ad2138534))
* **internal:** codegen related update ([ce52e15](https://github.com/openlayer-ai/openlayer-java/commit/ce52e159a41280088862b8be8b5dd41194051ed9))
* sync repo ([390e75d](https://github.com/openlayer-ai/openlayer-java/commit/390e75d8719363b5395eed54c1ce3c9d8d0412fb))


### Documentation

* add Spring AI sample application ([4cc1fb8](https://github.com/openlayer-ai/openlayer-java/commit/4cc1fb87584f47679b4e1be12be9f1d1e796481b))
* remove or fix invalid readme examples ([9372b90](https://github.com/openlayer-ai/openlayer-java/commit/9372b9032b7e05eb6055a5e71acc6570422146a5))


### Refactors

* **internal:** minor `ClientOptionsTest` change ([7d83620](https://github.com/openlayer-ai/openlayer-java/commit/7d83620f3a8595e17002b9f070187a61bd4e28f0))

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
