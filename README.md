# Native Scala InvisiRisk BAF QA

An isolated Scala/sbt compatibility test for InvisiRisk Build Application Firewall on a GitHub-hosted Ubuntu runner.

The manually dispatched `ir-native` job starts InvisiRisk BAF, resolves the sbt dependency graph, runs the tests, generates a CycloneDX SBOM, and uploads the generated `*.bom.json` file. Compare the artifact with the IR staging portal build associated with `scala-native-sbt-<run id>`.

## Required secret

Configure `IR_API_KEY` as a repository Actions secret containing the token for an owned InvisiRisk staging project. Do not use a production token for this QA repository.

Run locally with Java 17 and sbt:

```bash
sbt -batch clean update test makeBom
```
