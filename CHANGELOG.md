# Changelog

## 0.8.1 (2026-04-10)

Full Changelog: [v0.8.0...v0.8.1](https://github.com/openlayer-ai/openlayer-java/compare/v0.8.0...v0.8.1)

### Documentation

* **closes OPEN-9953:** expose endpoints to get and delete a row ([682a32d](https://github.com/openlayer-ai/openlayer-java/commit/682a32d4bff9c731036a5828b3423141200fb08b))

## 0.8.0 (2026-04-01)

Full Changelog: [v0.7.0...v0.8.0](https://github.com/openlayer-ai/openlayer-java/compare/v0.7.0...v0.8.0)

### Features

* Cid/fetching endpoints ([5efb36f](https://github.com/openlayer-ai/openlayer-java/commit/5efb36f68fc0db96132ce01bb61f43fb469f2b6e))

## 0.7.0 (2026-04-01)

Full Changelog: [v0.6.2...v0.7.0](https://github.com/openlayer-ai/openlayer-java/compare/v0.6.2...v0.7.0)

### ⚠ BREAKING CHANGES

* **client:** extract auto pagination to shared classes
* **client:** **Migration:** - If you were referencing the `AutoPager` class on a specific `*Page` or `*PageAsync` type, then you should instead reference the shared `AutoPager` and `AutoPagerAsync` types, under the `core` package
    - `AutoPagerAsync` now has different usage. You can call `.subscribe(...)` on the returned object instead to get called back each page item. You can also call `onCompleteFuture()` to get a future that completes when all items have been processed. Finally, you can call `.close()` on the returned object to stop auto-paginating early
    - If you were referencing `getNextPage` or `getNextPageParams`:
       - Swap to `nextPage()` and `nextPageParams()`
       - Note that these both now return non-optional types (use `hasNextPage()` before calling these, since they will throw if it's impossible to get another page)

### Features

* **api:** add missing endpoints ([0fd157b](https://github.com/openlayer-ai/openlayer-java/commit/0fd157bf086077ee3fc168af487149cd1c77402f))
* **api:** add test evaluation method ([d0640a7](https://github.com/openlayer-ai/openlayer-java/commit/d0640a7d75355f4c98a7cc643dd0c5f3419b6db7))
* **api:** api update ([db0bfe7](https://github.com/openlayer-ai/openlayer-java/commit/db0bfe7d62c4b28ea22bf7a4881a47c2700ce5cd))
* **api:** api update ([553299c](https://github.com/openlayer-ai/openlayer-java/commit/553299c6fc5a77b8064ca6c7257cd48f6a6a3a62))
* **api:** api update ([e8df0b8](https://github.com/openlayer-ai/openlayer-java/commit/e8df0b82ac5c40d9b22f5476def4063a1d963977))
* **api:** api update ([#68](https://github.com/openlayer-ai/openlayer-java/issues/68)) ([f58ba60](https://github.com/openlayer-ai/openlayer-java/commit/f58ba60cd5587a6fc72cb3b7cb9da7740616fbd2))
* **api:** manual updates ([243f364](https://github.com/openlayer-ai/openlayer-java/commit/243f364f4a06a3c3f501067d3b0c0b87eec1a202))
* **api:** manual updates ([#42](https://github.com/openlayer-ai/openlayer-java/issues/42)) ([c783d0d](https://github.com/openlayer-ai/openlayer-java/commit/c783d0d04755b5f3e87011827c0a5e7f6d780f85))
* **api:** manual updates ([#43](https://github.com/openlayer-ai/openlayer-java/issues/43)) ([307340d](https://github.com/openlayer-ai/openlayer-java/commit/307340dc6d484b1d283d3252a4c7b184cec3f1d1))
* **api:** OpenAPI spec update via Stainless API ([da3f817](https://github.com/openlayer-ai/openlayer-java/commit/da3f8173e91a3f62c1a8ecf07198baff04afccda))
* **api:** OpenAPI spec update via Stainless API ([#13](https://github.com/openlayer-ai/openlayer-java/issues/13)) ([d6ee032](https://github.com/openlayer-ai/openlayer-java/commit/d6ee0328a6db44cc66abf230fd192e52ff042332))
* **api:** OpenAPI spec update via Stainless API ([#16](https://github.com/openlayer-ai/openlayer-java/issues/16)) ([5a5a5ba](https://github.com/openlayer-ai/openlayer-java/commit/5a5a5bad520a462631282438069d1e040056e3c3))
* **api:** OpenAPI spec update via Stainless API ([#22](https://github.com/openlayer-ai/openlayer-java/issues/22)) ([90c35a9](https://github.com/openlayer-ai/openlayer-java/commit/90c35a9e48dbfd610de5e3dcc60c81a424d4a0df))
* **api:** OpenAPI spec update via Stainless API ([#36](https://github.com/openlayer-ai/openlayer-java/issues/36)) ([7bc6a73](https://github.com/openlayer-ai/openlayer-java/commit/7bc6a73cacdc7317c088387d88955bdf141b4e21))
* **api:** OpenAPI spec update via Stainless API ([#8](https://github.com/openlayer-ai/openlayer-java/issues/8)) ([9d50db9](https://github.com/openlayer-ai/openlayer-java/commit/9d50db9ff004f4720dc9d16dae1f4e7dceed0949))
* **api:** OpenAPI spec update via Stainless API ([#9](https://github.com/openlayer-ai/openlayer-java/issues/9)) ([cfe4133](https://github.com/openlayer-ai/openlayer-java/commit/cfe41334149e1efba03bfe21f5c590957ba5620e))
* **api:** update POST /rows to use list method name ([5917df4](https://github.com/openlayer-ai/openlayer-java/commit/5917df4eef5e978b6043ee381db930426336be2d))
* **api:** update via SDK Studio ([#1](https://github.com/openlayer-ai/openlayer-java/issues/1)) ([0afa19f](https://github.com/openlayer-ai/openlayer-java/commit/0afa19fc779177296942529e4dbd497d2a529884))
* **api:** update via SDK Studio ([#10](https://github.com/openlayer-ai/openlayer-java/issues/10)) ([2d1902c](https://github.com/openlayer-ai/openlayer-java/commit/2d1902c9261e736a94be3ba96956621f332c39d1))
* **api:** update via SDK Studio ([#14](https://github.com/openlayer-ai/openlayer-java/issues/14)) ([28c2236](https://github.com/openlayer-ai/openlayer-java/commit/28c2236a34b4c4a465a96a7da5e50887a7f952d2))
* **api:** update via SDK Studio ([#15](https://github.com/openlayer-ai/openlayer-java/issues/15)) ([f946ae8](https://github.com/openlayer-ai/openlayer-java/commit/f946ae8af67ca17778da18564f35888222489473))
* **api:** update via SDK Studio ([#21](https://github.com/openlayer-ai/openlayer-java/issues/21)) ([1719e53](https://github.com/openlayer-ai/openlayer-java/commit/1719e537914f492c708f02fb2f1fe26d0b9ac68a))
* **api:** update via SDK Studio ([#23](https://github.com/openlayer-ai/openlayer-java/issues/23)) ([f38382d](https://github.com/openlayer-ai/openlayer-java/commit/f38382dbb535aa2da00f474a44d7db2d83406be8))
* **api:** update via SDK Studio ([#24](https://github.com/openlayer-ai/openlayer-java/issues/24)) ([5185670](https://github.com/openlayer-ai/openlayer-java/commit/5185670da64e566ff40f10e8a9084d639543f2f1))
* **api:** update via SDK Studio ([#27](https://github.com/openlayer-ai/openlayer-java/issues/27)) ([fbdb579](https://github.com/openlayer-ai/openlayer-java/commit/fbdb579abc2b9958a852ac25b5f171a75446e249))
* **api:** update via SDK Studio ([#32](https://github.com/openlayer-ai/openlayer-java/issues/32)) ([d81fedc](https://github.com/openlayer-ai/openlayer-java/commit/d81fedcc034776eaff3a58578e0ed78792b7ba9d))
* **api:** update via SDK Studio ([#40](https://github.com/openlayer-ai/openlayer-java/issues/40)) ([79fb06d](https://github.com/openlayer-ai/openlayer-java/commit/79fb06d5f876b0239bb10df4ce8c4ccb56b6ddb7))
* **api:** update via SDK Studio ([#41](https://github.com/openlayer-ai/openlayer-java/issues/41)) ([eefdf01](https://github.com/openlayer-ai/openlayer-java/commit/eefdf01a1cde39d0bb0a993c7b888b2791e5682d))
* **api:** update via SDK Studio ([#5](https://github.com/openlayer-ai/openlayer-java/issues/5)) ([f01f468](https://github.com/openlayer-ai/openlayer-java/commit/f01f468c2b6a0521a5f67bf7715d9d1e68eab49c))
* **api:** update via SDK Studio ([#7](https://github.com/openlayer-ai/openlayer-java/issues/7)) ([ee5c439](https://github.com/openlayer-ai/openlayer-java/commit/ee5c4390fa653422eedd2f26aace03ce6d028e0f))
* **client:** add a `withOptions` method ([0ec9c48](https://github.com/openlayer-ai/openlayer-java/commit/0ec9c4807aef520b5e29079313970b990e1f0e17))
* **client:** add connection pooling option ([ba03a66](https://github.com/openlayer-ai/openlayer-java/commit/ba03a664d64d15fac9943323b98067702a8e4420))
* **client:** add logging when debug env is set ([#56](https://github.com/openlayer-ai/openlayer-java/issues/56)) ([dfc852f](https://github.com/openlayer-ai/openlayer-java/commit/dfc852ff4ab69ff78e12f5bb7571d39b76c2ee4d))
* **client:** allow configuring dispatcher executor service ([2638be9](https://github.com/openlayer-ai/openlayer-java/commit/2638be9abf4a2df28bb5f4d0d0c9d870f6783bc5))
* **client:** allow providing some params positionally ([12d07d2](https://github.com/openlayer-ai/openlayer-java/commit/12d07d2d7acbac98f449404d2ec46ec22317007b))
* **client:** extract auto pagination to shared classes ([899dfb7](https://github.com/openlayer-ai/openlayer-java/commit/899dfb7218a0c1811896e97ca5408e75854f3929))
* **client:** implement per-endpoint base URL support ([f2acdbc](https://github.com/openlayer-ai/openlayer-java/commit/f2acdbc285ae74999682585e4b2ab2c88b2a4795))
* **client:** send `X-Stainless-Kotlin-Version` header ([9a8ed3e](https://github.com/openlayer-ai/openlayer-java/commit/9a8ed3e4f3def4ddd079f3cf9b7c91ba55bd643b))
* **closes OPEN-8532:** expose 'tests/{id}/results' endpoint ([4764b16](https://github.com/openlayer-ai/openlayer-java/commit/4764b16756b0f9cd816995693987be6829fb9126))
* **closes OPEN-9425:** document /rows endpoint in API reference and … ([1a6b3bf](https://github.com/openlayer-ai/openlayer-java/commit/1a6b3bfda0c4116179ab2f3631f8fc586452fe9b))


### Bug Fixes

* add missing fields ([0bec16b](https://github.com/openlayer-ai/openlayer-java/commit/0bec16be7676fbf225264de4ec2ce961ae6544d1))
* **ci:** release-doctor — report correct token name ([ce92c93](https://github.com/openlayer-ai/openlayer-java/commit/ce92c93818225f297dd3400496614f75f75d3b78))
* **client:** allow updating header/query affecting fields in `toBuilder()` ([2abc904](https://github.com/openlayer-ai/openlayer-java/commit/2abc9043417221d78bbae27187f9c246819d022a))
* **client:** bump max requests per host to max requests (5 -&gt; 64) ([d52f901](https://github.com/openlayer-ai/openlayer-java/commit/d52f901967961f2d5ded480dd645aea22f575b1b))
* **client:** disallow coercion from float to int ([77375ef](https://github.com/openlayer-ai/openlayer-java/commit/77375efd65db9facf75d8b2aa99b39d9afe0f3c0))
* **client:** don't close client on `withOptions` usage when original is gc'd ([141e428](https://github.com/openlayer-ai/openlayer-java/commit/141e428fa7f7791af1b79183ee64bfe76fc2a588))
* **client:** fully respect max retries ([2ba65fe](https://github.com/openlayer-ai/openlayer-java/commit/2ba65fe6381b629c7ae6cd39bf823f0257856926))
* **client:** incorrect `Retry-After` parsing ([ce73303](https://github.com/openlayer-ai/openlayer-java/commit/ce73303bae99ab5da3feceb0930d4dac0c08504f))
* **client:** preserve time zone in lenient date-time parsing ([3951fed](https://github.com/openlayer-ai/openlayer-java/commit/3951fed358ece855bef4e975ee25f4edd3493aba))
* **client:** remove `@MustBeClosed` for future returning methods ([c6ebbbc](https://github.com/openlayer-ai/openlayer-java/commit/c6ebbbcc3fa3bed0b58c36f2228ebf599953b534))
* **client:** send retry count header for max retries 0 ([2ba65fe](https://github.com/openlayer-ai/openlayer-java/commit/2ba65fe6381b629c7ae6cd39bf823f0257856926))
* date time deserialization leniency ([9020a49](https://github.com/openlayer-ai/openlayer-java/commit/9020a49104b482b2c943eec67991b492d16abc65))
* deserialization order ([9622bc0](https://github.com/openlayer-ai/openlayer-java/commit/9622bc0e072a6ab16b974cf92cc97e31f64b2ecf))
* **docs:** use correct putAdditionalProperty value ([#33](https://github.com/openlayer-ai/openlayer-java/issues/33)) ([8edb19d](https://github.com/openlayer-ai/openlayer-java/commit/8edb19dbd0a52d5551f612c7b020a1a89c535162))
* update stream data example ([01a6acb](https://github.com/openlayer-ai/openlayer-java/commit/01a6acb859853b961556dcc7e51b91a40def3461))


### Chores

* **ci:** enable for pull requests ([f5f2c18](https://github.com/openlayer-ai/openlayer-java/commit/f5f2c189163743554902b3f3e3ad02dd4b2f08e1))
* **ci:** limit release doctor target branches ([#17](https://github.com/openlayer-ai/openlayer-java/issues/17)) ([15b4e15](https://github.com/openlayer-ai/openlayer-java/commit/15b4e158ab9b89c77805374a30c5e5b22319a843))
* **ci:** only run for pushes and fork pull requests ([9f2001f](https://github.com/openlayer-ai/openlayer-java/commit/9f2001f4d7a981bbddc54da2aa000e29a1bb2083))
* **ci:** skip lint on metadata-only changes ([7bf62eb](https://github.com/openlayer-ai/openlayer-java/commit/7bf62ebcaa667e85fee97ca5ef74dec1ab91bf58))
* **ci:** upgrade `actions/github-script` ([676a815](https://github.com/openlayer-ai/openlayer-java/commit/676a815ed1c6c91d72d73147974afcce5cc8cf2a))
* **ci:** upgrade `actions/setup-java` ([da00776](https://github.com/openlayer-ai/openlayer-java/commit/da00776ba0b3e10e3a67b8dc2f5992618c90f5bd))
* **closes OPEN-8576:** expose delete project endpoint ([88a190d](https://github.com/openlayer-ai/openlayer-java/commit/88a190d4980204be9546a2a7a76ab6c261c806e9))
* **closes OPEN-8644:** address warnings on Stainless studio ([fcaebce](https://github.com/openlayer-ai/openlayer-java/commit/fcaebce16fde11d769b0bcbc65ddb74a9b929a27))
* **closes OPEN-8647:** add endpoint to retrieve aggregated user data for inference pipelines ([4a8fade](https://github.com/openlayer-ai/openlayer-java/commit/4a8fade158902a6747ebdff0735116b215ea2406))
* custom code changes ([#44](https://github.com/openlayer-ai/openlayer-java/issues/44)) ([c97f231](https://github.com/openlayer-ai/openlayer-java/commit/c97f2317807f5b0f05eb602f06c97082d099e956))
* **docs:** add example project ([#71](https://github.com/openlayer-ai/openlayer-java/issues/71)) ([92b7a53](https://github.com/openlayer-ai/openlayer-java/commit/92b7a538423a5d9875eba16b421cdedf657a33b8))
* **docs:** add example project ([#75](https://github.com/openlayer-ai/openlayer-java/issues/75)) ([449701f](https://github.com/openlayer-ai/openlayer-java/commit/449701f783ef12781d482398d2326116f2a4e82b))
* **docs:** grammar improvements ([b4247da](https://github.com/openlayer-ai/openlayer-java/commit/b4247da66979f554f380f085faf5b14361f4b8b3))
* **docs:** update readme ([#70](https://github.com/openlayer-ai/openlayer-java/issues/70)) ([ebe38c3](https://github.com/openlayer-ai/openlayer-java/commit/ebe38c3c81402278c42a2af94f2e959e0ad22aac))
* **docs:** update readme ([#73](https://github.com/openlayer-ai/openlayer-java/issues/73)) ([e4abac7](https://github.com/openlayer-ai/openlayer-java/commit/e4abac77b4cfc5de991571aa11af3a7b63f3529c))
* drop apache dependency ([9a86410](https://github.com/openlayer-ai/openlayer-java/commit/9a864103a8676869d8ec562c62aac631637947f3))
* go live ([#6](https://github.com/openlayer-ai/openlayer-java/issues/6)) ([362fb69](https://github.com/openlayer-ai/openlayer-java/commit/362fb69783c7b4b87f4a13d9856fd35d7fd11024))
* **internal:** allow passing args to `./scripts/test` ([e22eb3c](https://github.com/openlayer-ai/openlayer-java/commit/e22eb3c64eb0693888f6144594a701da9940ada6))
* **internal:** bump ktfmt ([03d1fab](https://github.com/openlayer-ai/openlayer-java/commit/03d1fab22a5a46c28f73c1deee51c5f9b058338d))
* **internal:** bump palantir-java-format ([8cd3a11](https://github.com/openlayer-ai/openlayer-java/commit/8cd3a11916616bf534c775dbdf208297a9978384))
* **internal:** clean up maven repo artifact script and add html documentation to repo root ([53e8641](https://github.com/openlayer-ai/openlayer-java/commit/53e86410503ce720e6eae94f1cb79aa329365915))
* **internal:** codegen related update ([b8f7dd3](https://github.com/openlayer-ai/openlayer-java/commit/b8f7dd30fe8fb7e0aed733e3e5ef8b04cb89a897))
* **internal:** codegen related update ([c11e606](https://github.com/openlayer-ai/openlayer-java/commit/c11e606c309bb79ffbb5b769d492557b77f687a6))
* **internal:** codegen related update ([4b4ac8d](https://github.com/openlayer-ai/openlayer-java/commit/4b4ac8d71e31355ddd9616741f2555c5e3f81964))
* **internal:** codegen related update ([d01fae1](https://github.com/openlayer-ai/openlayer-java/commit/d01fae19fa9d8afc99dadcfd5ca15677ad3772c3))
* **internal:** codegen related update ([82d8cbd](https://github.com/openlayer-ai/openlayer-java/commit/82d8cbd1d99ff549d6b0526253b2993a8a8b5957))
* **internal:** codegen related update ([92a3bdf](https://github.com/openlayer-ai/openlayer-java/commit/92a3bdf0acf120399ce5df91c31dad29d195aaf4))
* **internal:** codegen related update ([66e41f4](https://github.com/openlayer-ai/openlayer-java/commit/66e41f4f2f639dab1f30b840d3dc95064b29af8a))
* **internal:** codegen related update ([#18](https://github.com/openlayer-ai/openlayer-java/issues/18)) ([1a0ebfe](https://github.com/openlayer-ai/openlayer-java/commit/1a0ebfe843e1f82b799e58f49656af609f39788f))
* **internal:** codegen related update ([#52](https://github.com/openlayer-ai/openlayer-java/issues/52)) ([ee0ca36](https://github.com/openlayer-ai/openlayer-java/commit/ee0ca3691a8e2ef052d3df2b318e3195359396ad))
* **internal:** codegen related update ([#54](https://github.com/openlayer-ai/openlayer-java/issues/54)) ([ebfe585](https://github.com/openlayer-ai/openlayer-java/commit/ebfe5851d88125c0aa74d7d3e93db7df3405d64a))
* **internal:** codegen related update ([#58](https://github.com/openlayer-ai/openlayer-java/issues/58)) ([cacb99b](https://github.com/openlayer-ai/openlayer-java/commit/cacb99ba1c1046e9d1de51b99f087432c3e1bf07))
* **internal:** codegen related update ([#66](https://github.com/openlayer-ai/openlayer-java/issues/66)) ([9dce8d6](https://github.com/openlayer-ai/openlayer-java/commit/9dce8d6ffbe3a03564db8c19cd0312cf33d143ff))
* **internal:** codegen related update ([#72](https://github.com/openlayer-ai/openlayer-java/issues/72)) ([aa604fb](https://github.com/openlayer-ai/openlayer-java/commit/aa604fb7bbbf5df5f46823321fb0edf91f75125a))
* **internal:** codegen related update ([#74](https://github.com/openlayer-ai/openlayer-java/issues/74)) ([f32b8fe](https://github.com/openlayer-ai/openlayer-java/commit/f32b8fefdd1053a7b0d1f9223957a4f2ba8c93e3))
* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([02a7276](https://github.com/openlayer-ai/openlayer-java/commit/02a7276e024eecaa97c17d356d2f509a3efc765e))
* **internal:** depend on packages directly in example ([2ba65fe](https://github.com/openlayer-ai/openlayer-java/commit/2ba65fe6381b629c7ae6cd39bf823f0257856926))
* **internal:** expand imports ([11778da](https://github.com/openlayer-ai/openlayer-java/commit/11778dafad0c1e38ec2108b85a694c7611066852))
* **internal:** improve maven repo docs ([71aeb5b](https://github.com/openlayer-ai/openlayer-java/commit/71aeb5b77214775d4968ba9e00725bc68c3f4412))
* **internal:** make `OkHttp` constructor internal ([80b7734](https://github.com/openlayer-ai/openlayer-java/commit/80b7734a8abc0b1d8064e00ec661ec8398acf617))
* **internal:** refactor release doctor script ([#19](https://github.com/openlayer-ai/openlayer-java/issues/19)) ([c5697d2](https://github.com/openlayer-ai/openlayer-java/commit/c5697d28e0e450c5e2690119142d50f5b40483fc))
* **internal:** remove unused imports ([#65](https://github.com/openlayer-ai/openlayer-java/issues/65)) ([ee8efa5](https://github.com/openlayer-ai/openlayer-java/commit/ee8efa51b941939f2f4a775a66796363f0960228))
* **internal:** restore release-please configuration files ([#26](https://github.com/openlayer-ai/openlayer-java/issues/26)) ([a1e98a3](https://github.com/openlayer-ai/openlayer-java/commit/a1e98a3505e24b11d2a4dffc1f9bf65fa13268f8))
* **internal:** support uploading Maven repo artifacts to stainless package server ([5439587](https://github.com/openlayer-ai/openlayer-java/commit/54395875eaed0588a984e2f4f4dfce42ad723955))
* **internal:** tweak CI branches ([c1520a9](https://github.com/openlayer-ai/openlayer-java/commit/c1520a9f9189ec324b5aef9717bdae9d2148ede5))
* **internal:** update `actions/checkout` version ([7e798ae](https://github.com/openlayer-ai/openlayer-java/commit/7e798ae39e1c2013503867cba64e5037b4a1e72d))
* **internal:** update `TestServerExtension` comment ([072130f](https://github.com/openlayer-ai/openlayer-java/commit/072130f02dbc9aeb69f7a09a58faae24ae07e420))
* **internal:** update gitignore ([b35a3d6](https://github.com/openlayer-ai/openlayer-java/commit/b35a3d643c859f282013bde1be2e07279866cffe))
* **internal:** update maven repo doc to include authentication ([0d5935b](https://github.com/openlayer-ai/openlayer-java/commit/0d5935b4c3fe95c01724a41e95918498396591a6))
* **internal:** update multipart form array serialization ([9049ffa](https://github.com/openlayer-ai/openlayer-java/commit/9049ffab1273f693ba8c91ba5028fe5e5f7187ff))
* **internal:** update retry delay tests ([40e87ce](https://github.com/openlayer-ai/openlayer-java/commit/40e87ce21188f0be8e11ceefbbedd6de92be1b3e))
* **internal:** upgrade AssertJ ([f4798fb](https://github.com/openlayer-ai/openlayer-java/commit/f4798fb9b19024b3e86a38f8a4460558611097fc))
* **internal:** version bump ([#3](https://github.com/openlayer-ai/openlayer-java/issues/3)) ([2e46974](https://github.com/openlayer-ai/openlayer-java/commit/2e46974aefcd77a33417b3d675bea14ccb95befd))
* make `Properties` more resilient to `null` ([1f99443](https://github.com/openlayer-ai/openlayer-java/commit/1f99443bb66ce5c76d0d635a8137fd1f29d60699))
* rebuild project due to codegen change ([#45](https://github.com/openlayer-ai/openlayer-java/issues/45)) ([cd40b00](https://github.com/openlayer-ai/openlayer-java/commit/cd40b0041bdf593ad5ca4927d9e4ff93eb8dc67c))
* rebuild project due to codegen change ([#47](https://github.com/openlayer-ai/openlayer-java/issues/47)) ([bcae1b0](https://github.com/openlayer-ai/openlayer-java/commit/bcae1b02eeb6334174ad58dc1efe5258b048750e))
* rebuild project due to codegen change ([#50](https://github.com/openlayer-ai/openlayer-java/issues/50)) ([c7db287](https://github.com/openlayer-ai/openlayer-java/commit/c7db28794e4dea84d90e88c26d22cb7b7ae43f6b))
* remove _meta ([edc750e](https://github.com/openlayer-ai/openlayer-java/commit/edc750e5ea163def28f2d96f22171ae30c24395e))
* sync repo ([f7f1be8](https://github.com/openlayer-ai/openlayer-java/commit/f7f1be8915e88cd472b8a5264498d430edda5dfe))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/openlayer-ai/openlayer-java/issues/3240) in tests ([9020a49](https://github.com/openlayer-ai/openlayer-java/commit/9020a49104b482b2c943eec67991b492d16abc65))
* **test:** do not count install time for mock server timeout ([43c1d18](https://github.com/openlayer-ai/openlayer-java/commit/43c1d18cc2af66617b185520407c66be514d6671))
* **tests:** bump steady to v0.19.4 ([70782fd](https://github.com/openlayer-ai/openlayer-java/commit/70782fda4eb5fc6d3b9a0b855b6f2a31b74fb802))
* **tests:** bump steady to v0.19.5 ([908ffeb](https://github.com/openlayer-ai/openlayer-java/commit/908ffebe6143b08739be3c384abf8f718213347e))
* **tests:** bump steady to v0.19.6 ([b5cc65d](https://github.com/openlayer-ai/openlayer-java/commit/b5cc65de8a475f2ffb1ed5a0528db81abe30c1b7))
* **tests:** bump steady to v0.19.7 ([7203ca9](https://github.com/openlayer-ai/openlayer-java/commit/7203ca97fe695949b42bb137284e726af7166eab))
* **tests:** bump steady to v0.20.1 ([e02947e](https://github.com/openlayer-ai/openlayer-java/commit/e02947edd8f9559866c04e192eb840f2597e58b7))
* **tests:** bump steady to v0.20.2 ([3493f2d](https://github.com/openlayer-ai/openlayer-java/commit/3493f2d0d48fdb4cb91bf474bd6b6a70b76b9e0d))
* **tests:** update prism version ([#25](https://github.com/openlayer-ai/openlayer-java/issues/25)) ([869979f](https://github.com/openlayer-ai/openlayer-java/commit/869979ff71526ecbe776d8850fdba024ad9080b5))
* update example values in tests and docs ([#61](https://github.com/openlayer-ai/openlayer-java/issues/61)) ([9261558](https://github.com/openlayer-ai/openlayer-java/commit/9261558e69cb84bcc814dec61c061ceee18f654e))


### Documentation

* add comment for arbitrary value fields ([14034ba](https://github.com/openlayer-ai/openlayer-java/commit/14034ba66a924d5cb7a506c60d22281532a58d18))
* add Spring AI sample application ([4cc1fb8](https://github.com/openlayer-ai/openlayer-java/commit/4cc1fb87584f47679b4e1be12be9f1d1e796481b))
* remove or fix invalid readme examples ([3832089](https://github.com/openlayer-ai/openlayer-java/commit/38320897fe6ecdbdf46d6d09a7ea6be649730d21))


### Styles

* **internal:** make enum value definitions less verbose ([#63](https://github.com/openlayer-ai/openlayer-java/issues/63)) ([af7768b](https://github.com/openlayer-ai/openlayer-java/commit/af7768b795284d1c0ab31cd515bce153aadccc40))
* **internal:** move enum identity methods to bottom of class ([#64](https://github.com/openlayer-ai/openlayer-java/issues/64)) ([8be700e](https://github.com/openlayer-ai/openlayer-java/commit/8be700e93d610cd40819d505da532650d719f916))


### Refactors

* **internal:** minor `ClientOptionsTest` change ([75ae750](https://github.com/openlayer-ai/openlayer-java/commit/75ae750bb6e5cfffe87a68e00b6c118d34f13b56))
* **tests:** switch from prism to steady ([75c6133](https://github.com/openlayer-ai/openlayer-java/commit/75c613383894dc1350ee64121298d4c6756ff063))

## 0.6.2 (2026-03-20)

Full Changelog: [v0.6.1...v0.6.2](https://github.com/openlayer-ai/openlayer-java/compare/v0.6.1...v0.6.2)

### Bug Fixes

* **client:** allow updating header/query affecting fields in `toBuilder()` ([d8d7183](https://github.com/openlayer-ai/openlayer-java/commit/d8d71833a6e9c2558290671cc7eb09929a7052cc))


### Chores

* **internal:** bump ktfmt ([b5baeb0](https://github.com/openlayer-ai/openlayer-java/commit/b5baeb0a9a47e2b1bd713141c8ec1b0f89a42317))
* **internal:** tweak CI branches ([213ce88](https://github.com/openlayer-ai/openlayer-java/commit/213ce883034978b2e18bae11630c5d32a627058a))
* **internal:** update retry delay tests ([29c1ab3](https://github.com/openlayer-ai/openlayer-java/commit/29c1ab379fc3a5f5a2c90e6a46c93e9060309f1e))


### Refactors

* **tests:** switch from prism to steady ([0c240d8](https://github.com/openlayer-ai/openlayer-java/commit/0c240d8156ac2385a97f39e8017efef69293edfe))

## 0.6.1 (2026-03-11)

Full Changelog: [v0.6.0...v0.6.1](https://github.com/openlayer-ai/openlayer-java/compare/v0.6.0...v0.6.1)

### Bug Fixes

* **client:** incorrect `Retry-After` parsing ([434a822](https://github.com/openlayer-ai/openlayer-java/commit/434a82208f0b50705ac7ce7fe740650479c0fabb))

## 0.6.0 (2026-03-06)

Full Changelog: [v0.5.2...v0.6.0](https://github.com/openlayer-ai/openlayer-java/compare/v0.5.2...v0.6.0)

### Features

* **api:** update POST /rows to use list method name ([5fd64a9](https://github.com/openlayer-ai/openlayer-java/commit/5fd64a9fbe3c0218e9bd25d81d3341a9c92d37bc))
* **closes OPEN-9425:** document /rows endpoint in API reference and … ([e9093d0](https://github.com/openlayer-ai/openlayer-java/commit/e9093d022dfd5a333252214f0a6a5f1eaf3049b7))


### Chores

* **internal:** bump palantir-java-format ([3b5458b](https://github.com/openlayer-ai/openlayer-java/commit/3b5458bd3c2dd9d7107e13834d39b69202a2199a))
* **internal:** codegen related update ([d1f3122](https://github.com/openlayer-ai/openlayer-java/commit/d1f3122b9f64430fc58f5c6dc86c74aba371cd39))
* **test:** do not count install time for mock server timeout ([e2cc9fd](https://github.com/openlayer-ai/openlayer-java/commit/e2cc9fd39b862bf6bf9eff79b205e078b16d9080))

## 0.5.2 (2026-02-25)

Full Changelog: [v0.5.1...v0.5.2](https://github.com/openlayer-ai/openlayer-java/compare/v0.5.1...v0.5.2)

### Chores

* **internal:** expand imports ([da2516b](https://github.com/openlayer-ai/openlayer-java/commit/da2516b8cf516f4b04041676af331a1180fa2f3a))

## 0.5.1 (2026-02-24)

Full Changelog: [v0.5.0...v0.5.1](https://github.com/openlayer-ai/openlayer-java/compare/v0.5.0...v0.5.1)

### Chores

* drop apache dependency ([c189130](https://github.com/openlayer-ai/openlayer-java/commit/c189130bcb7d4d925ab0ba5a6666760176ac4a27))
* make `Properties` more resilient to `null` ([8c199df](https://github.com/openlayer-ai/openlayer-java/commit/8c199df8c9b0acd5d409c287f24bdd31fba7050b))

## 0.5.0 (2026-02-19)

Full Changelog: [v0.4.5...v0.5.0](https://github.com/openlayer-ai/openlayer-java/compare/v0.4.5...v0.5.0)

### Features

* **client:** add connection pooling option ([b59994e](https://github.com/openlayer-ai/openlayer-java/commit/b59994e9c6c0e6f035d27138205e368b458450af))


### Chores

* **internal:** make `OkHttp` constructor internal ([bd14e2b](https://github.com/openlayer-ai/openlayer-java/commit/bd14e2b594e95b359c27cbdca104bdb6533e8420))

## 0.4.5 (2026-02-18)

Full Changelog: [v0.4.4...v0.4.5](https://github.com/openlayer-ai/openlayer-java/compare/v0.4.4...v0.4.5)

### Chores

* **internal:** update `TestServerExtension` comment ([8497364](https://github.com/openlayer-ai/openlayer-java/commit/849736434c7bfdb34ea60af691a2ef9212bee9a4))

## 0.4.4 (2026-02-10)

Full Changelog: [v0.4.3...v0.4.4](https://github.com/openlayer-ai/openlayer-java/compare/v0.4.3...v0.4.4)

### Chores

* **closes OPEN-8647:** add endpoint to retrieve aggregated user data for inference pipelines ([56ac536](https://github.com/openlayer-ai/openlayer-java/commit/56ac5369af85619049e4ca0a7e37a2411a643080))

## 0.4.3 (2026-02-07)

Full Changelog: [v0.4.2...v0.4.3](https://github.com/openlayer-ai/openlayer-java/compare/v0.4.2...v0.4.3)

### Chores

* **internal:** upgrade AssertJ ([0b6e8bc](https://github.com/openlayer-ai/openlayer-java/commit/0b6e8bc73a46bf33531954d5cbe6ed03790cc302))

## 0.4.2 (2026-01-31)

Full Changelog: [v0.4.1...v0.4.2](https://github.com/openlayer-ai/openlayer-java/compare/v0.4.1...v0.4.2)

### Chores

* **internal:** allow passing args to `./scripts/test` ([ab699d9](https://github.com/openlayer-ai/openlayer-java/commit/ab699d93f6e8090b74dfb8058cf00f3ed9408e79))

## 0.4.1 (2026-01-29)

Full Changelog: [v0.4.0...v0.4.1](https://github.com/openlayer-ai/openlayer-java/compare/v0.4.0...v0.4.1)

### Bug Fixes

* add missing fields ([9aa09b1](https://github.com/openlayer-ai/openlayer-java/commit/9aa09b1a074fc0bcf7ce3956889ad660af91bfa0))

## 0.4.0 (2026-01-24)

Full Changelog: [v0.3.4...v0.4.0](https://github.com/openlayer-ai/openlayer-java/compare/v0.3.4...v0.4.0)

### Features

* **client:** send `X-Stainless-Kotlin-Version` header ([77f36ca](https://github.com/openlayer-ai/openlayer-java/commit/77f36cac8bcdf064272a371f2538b065df5427eb))


### Bug Fixes

* **client:** preserve time zone in lenient date-time parsing ([5a2de35](https://github.com/openlayer-ai/openlayer-java/commit/5a2de356e6c859ba449dcfe286b357f27521fbd9))


### Chores

* **ci:** upgrade `actions/github-script` ([70b357f](https://github.com/openlayer-ai/openlayer-java/commit/70b357fd2d1743f7f6e34ae03fa8cba898c65a3b))
* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([e688c85](https://github.com/openlayer-ai/openlayer-java/commit/e688c8544109eec067139f1473d0d9ff487cc59b))
* **internal:** update maven repo doc to include authentication ([a3c15df](https://github.com/openlayer-ai/openlayer-java/commit/a3c15dfddb29743be7d5b02f3a455c93da07cd47))


### Documentation

* add comment for arbitrary value fields ([acdb1fc](https://github.com/openlayer-ai/openlayer-java/commit/acdb1fcb6659e10e763133180b96dd9a9250b4c0))

## 0.3.4 (2026-01-17)

Full Changelog: [v0.3.3...v0.3.4](https://github.com/openlayer-ai/openlayer-java/compare/v0.3.3...v0.3.4)

### Bug Fixes

* **client:** disallow coercion from float to int ([f3ef0fa](https://github.com/openlayer-ai/openlayer-java/commit/f3ef0fa08d2ce3af8cd4d9175463be44fb5d569b))
* **client:** fully respect max retries ([9dff5d8](https://github.com/openlayer-ai/openlayer-java/commit/9dff5d85da39bc072265e67fe2e3d9bd6d3be034))
* **client:** send retry count header for max retries 0 ([9dff5d8](https://github.com/openlayer-ai/openlayer-java/commit/9dff5d85da39bc072265e67fe2e3d9bd6d3be034))
* date time deserialization leniency ([9ac59d5](https://github.com/openlayer-ai/openlayer-java/commit/9ac59d53743d03f08395cc28f72c41e35e0e30f4))
* deserialization order ([ad92dd8](https://github.com/openlayer-ai/openlayer-java/commit/ad92dd885d76973378d5699da83cfa7a0104995d))


### Chores

* **ci:** upgrade `actions/setup-java` ([c16fb63](https://github.com/openlayer-ai/openlayer-java/commit/c16fb634cf2f59527439d272ea7252511e70ebcc))
* **internal:** depend on packages directly in example ([9dff5d8](https://github.com/openlayer-ai/openlayer-java/commit/9dff5d85da39bc072265e67fe2e3d9bd6d3be034))
* **internal:** improve maven repo docs ([160861a](https://github.com/openlayer-ai/openlayer-java/commit/160861a234015702311b250f857e5cacd3bf688b))
* **internal:** update `actions/checkout` version ([3524395](https://github.com/openlayer-ai/openlayer-java/commit/3524395582278a21e85344f679cd25047cd29491))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/openlayer-ai/openlayer-java/issues/3240) in tests ([9ac59d5](https://github.com/openlayer-ai/openlayer-java/commit/9ac59d53743d03f08395cc28f72c41e35e0e30f4))

## 0.3.3 (2026-01-16)

Full Changelog: [v0.3.2...v0.3.3](https://github.com/openlayer-ai/openlayer-java/compare/v0.3.2...v0.3.3)

### Chores

* **internal:** clean up maven repo artifact script and add html documentation to repo root ([9ea4d75](https://github.com/openlayer-ai/openlayer-java/commit/9ea4d75f3d2eeb073573f8ba009db50116697acb))

## 0.3.2 (2026-01-13)

Full Changelog: [v0.3.1...v0.3.2](https://github.com/openlayer-ai/openlayer-java/compare/v0.3.1...v0.3.2)

### Chores

* **internal:** support uploading Maven repo artifacts to stainless package server ([a494a36](https://github.com/openlayer-ai/openlayer-java/commit/a494a360f411a7e6bab6b32099349166abee3612))

## 0.3.1 (2026-01-12)

Full Changelog: [v0.3.0...v0.3.1](https://github.com/openlayer-ai/openlayer-java/compare/v0.3.0...v0.3.1)

### Chores

* **closes OPEN-8576:** expose delete project endpoint ([2084dab](https://github.com/openlayer-ai/openlayer-java/commit/2084dabf6b839d9454718259b20a106a5fb41a4a))

## 0.3.0 (2026-01-09)

Full Changelog: [v0.2.0...v0.3.0](https://github.com/openlayer-ai/openlayer-java/compare/v0.2.0...v0.3.0)

### Features

* **closes OPEN-8532:** expose 'tests/{id}/results' endpoint ([8815922](https://github.com/openlayer-ai/openlayer-java/commit/88159223fd10a427d7bfabe640439c1cebea4cc3))

## 0.2.0 (2026-01-09)

Full Changelog: [v0.1.1...v0.2.0](https://github.com/openlayer-ai/openlayer-java/compare/v0.1.1...v0.2.0)

### Features

* **client:** allow configuring dispatcher executor service ([abbc6d6](https://github.com/openlayer-ai/openlayer-java/commit/abbc6d68fd00e83237f28aa0916f6d4b58fecaae))

## 0.1.1 (2026-01-08)

Full Changelog: [v0.1.0...v0.1.1](https://github.com/openlayer-ai/openlayer-java/compare/v0.1.0...v0.1.1)

### Chores

* **closes OPEN-8644:** address warnings on Stainless studio ([353710c](https://github.com/openlayer-ai/openlayer-java/commit/353710c46fbc8cdb7ef50e40cea0fa89a82709b2))
* remove _meta ([93ad3a1](https://github.com/openlayer-ai/openlayer-java/commit/93ad3a1cf05146fed643f6852080e24a62729cdc))

## 0.1.0 (2026-01-08)

Full Changelog: [v0.1.0-alpha.12...v0.1.0](https://github.com/openlayer-ai/openlayer-java/compare/v0.1.0-alpha.12...v0.1.0)

### Features

* **api:** add missing endpoints ([db4b1fb](https://github.com/openlayer-ai/openlayer-java/commit/db4b1fbc7bd03820c3292f5e25bba78d606abb1f))

## 0.1.0-alpha.12 (2026-01-07)

Full Changelog: [v0.1.0-alpha.11...v0.1.0-alpha.12](https://github.com/openlayer-ai/openlayer-java/compare/v0.1.0-alpha.11...v0.1.0-alpha.12)

### ⚠ BREAKING CHANGES

* **client:** extract auto pagination to shared classes
* **client:** **Migration:** - If you were referencing the `AutoPager` class on a specific `*Page` or `*PageAsync` type, then you should instead reference the shared `AutoPager` and `AutoPagerAsync` types, under the `core` package
    - `AutoPagerAsync` now has different usage. You can call `.subscribe(...)` on the returned object instead to get called back each page item. You can also call `onCompleteFuture()` to get a future that completes when all items have been processed. Finally, you can call `.close()` on the returned object to stop auto-paginating early
    - If you were referencing `getNextPage` or `getNextPageParams`:
       - Swap to `nextPage()` and `nextPageParams()`
       - Note that these both now return non-optional types (use `hasNextPage()` before calling these, since they will throw if it's impossible to get another page)

### Features

* **api:** add test evaluation method ([e8d8121](https://github.com/openlayer-ai/openlayer-java/commit/e8d8121e473aa3cb7df501bf09332e86f199d55b))
* **api:** api update ([225da0c](https://github.com/openlayer-ai/openlayer-java/commit/225da0cd73e1262833789a6c63e9cd9a44cc4cea))
* **api:** api update ([a089f7f](https://github.com/openlayer-ai/openlayer-java/commit/a089f7f9714aa315e489b0fc6083c5ce8944e074))
* **api:** api update ([e48acb3](https://github.com/openlayer-ai/openlayer-java/commit/e48acb317d5b7786c78c593dca0c0e035dde211c))
* **api:** manual updates ([fd5752e](https://github.com/openlayer-ai/openlayer-java/commit/fd5752e3b7d9fb9c64ad3d39877dedbe71a397f2))
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
* **internal:** codegen related update ([9c97d6d](https://github.com/openlayer-ai/openlayer-java/commit/9c97d6d9cbbd1c93d7354747f0f8d9633f15e4e2))
* **internal:** codegen related update ([d2c9111](https://github.com/openlayer-ai/openlayer-java/commit/d2c9111482081d8b90ba4ad014edf5703a7be94f))
* **internal:** codegen related update ([942316f](https://github.com/openlayer-ai/openlayer-java/commit/942316fdb69201bb3236e73ad7103cf177dea070))
* **internal:** codegen related update ([9b5aa41](https://github.com/openlayer-ai/openlayer-java/commit/9b5aa4181f42a112860eaa69ba7057ca20894283))
* **internal:** codegen related update ([4881e6f](https://github.com/openlayer-ai/openlayer-java/commit/4881e6fb70e8d6d5f6d990a662647a9861165eb3))
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
