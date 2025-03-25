
# QRCode Service (Kotlin)

QRCode Service (Kotlin) er mitt første Spring Boot-baserte API skrevet i Kotlin og det genererer QR-koder ved hjelp av ZXing-biblioteket. Prosjektet er utviklet for å bestå Hyperskills interne tester (der det ikke finnes selvskrevne tester).

## Designvalg og Læringspunkter
- **Separation of Concerns:**  
  Kontrolleren (`QRCodeRestController`) håndterer HTTP-forespørsler, mens validering og bildekonvertering er delegert til egne metoder og klasser (som `ImageConverter`). 

- **Streng Inputvalidering:**  
  API-et sjekker  at brukerens input er korrekt (f.eks. at "contents" ikke er tom, at bildestørrelse er innenfor et definert område, at feilrettingsnivået og bildeformatet er gyldige). Dette sikrer bedre feilmeldinger og forhindrer uventet oppførsel.

- **Integrasjon av Eksterne Biblioteker:**  
  Ved å benytte ZXing for QR-kodegenerering og Spring Boot for rask oppsett av API-et, lærte jeg hvordan man kan integrere tredjepartsverktøy i kotlin og JVM for å løse konkrete oppgaver på en effektiv måte.
  
## Bygg og Kjør

**Bygging:**  
Kjør følgende kommando i prosjektets rotmappe for å bygge applikasjonen:
```bash
./gradlew build
```
Dette kompilerer prosjektet og genererer blant annet en kjørbar JAR-fil i build/libs/.

**Oppstart**:
Start applikasjonen med:
```
./gradlew bootRun
```
Applikasjonen starter på port 8080. Du kan teste at den kjører ved å besøke for eksempel:
```
http://localhost:8080/api/health
```

## Mulige Forbedringer

- **Automatiserte Tester:**  
  Selv om prosjektet er utformet for å bestå Hyperskills interne tester, vil implementering av enhetstester og integrasjonstester gjøre applikasjonen enda mer sikrere og enklere å videreutvikle.

- **Dynamisk Utvidelse av Funksjonalitet:**  
  Fremtidige versjoner kan inkludere flere konfigurasjonsmuligheter for QR-koder (som farger og marginer) og mulighet for å legge til nye parametre dynamisk.

- **Forbedret Feilhåndtering og Logging:**  
  Videre utvikling kan fokusere på mer omfattende logging og feilhåndtering for å lette feilsøking i produksjonsmiljøer.
