## json.org CVE-2022-45688 false positive

The project contains a [json.org](https://mvnrepository.com/artifact/org.json/json/20220924) dependency with [CVE-2022-45688](https://nvd.nist.gov/vuln/detail/CVE-2022-45688) but does __not__ invoke the vulnerable class.
The vulnerability can therefore not be exploited for a DoS attack.

Metadata-based software composition analyses will produce a false positive, while
callgraph-based analyses will not flag this application as vulnerable. 

### Running Software Composition Analyses

There are several sh scripts to run different analyses, result resports can be found in `scan-results`.

### Generating the SBOM

The `pom.xml` has a plugin to generate a [SBOM](https://www.cisa.gov/sbom) in [CycloneDX](https://cyclonedx.org/) format. 
To do this, run `mvn cyclonedx:makePackageBom`, the SBOM can be found in 
`target/` in `json` and `xml` format.

