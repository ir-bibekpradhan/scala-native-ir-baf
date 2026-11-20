# Native Scala InvisiRisk BAF QA

An isolated Scala/sbt compatibility test for InvisiRisk Build Application Firewall on a GitHub-hosted Ubuntu runner.

The manually dispatched workflow runs the same build twice:

- `baseline-native`: normal sbt dependency resolution, tests, and CycloneDX SBOM generation.
- `ir-native`: the same commands after InvisiRisk BAF starts.

Both jobs upload the generated `*.bom.json` file. Compare job duration, dependency output, SBOM component count, and the IR staging portal build associated with `scala-native-sbt-<run id>`.

## Required secret

Configure `IR_API_KEY` as a repository Actions secret containing the token for an owned InvisiRisk staging project. Do not use a production token for this QA repository.

Run locally with Java 17 and sbt:

```bash
sbt -batch clean update test makeBom
```
