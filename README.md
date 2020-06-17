# katalon-record-methods
Trying out record and playback

##running with docker
```
docker pull katalonstudio/katalon
docker run -t --rm -v "$(pwd)":/katalon/katalon/source katalonstudio/katalon katalon-execute.sh -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/TS_RegressionTest" -apiKey="$(KatalonApiKey)"
```
