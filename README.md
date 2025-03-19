
# QRCode Service (Kotlin)

QRCode Service (Kotlin) er et Spring Boot-basert API skrevet i Kotlin som genererer QR-koder ved hjelp av ZXing-biblioteket. Prosjektet er utviklet for å bestå Hyperskills interne tester (der det ikke finnes selvskrevne tester) og demonstrerer hvordan man kan bygge en modulær applikasjon med tydelig separasjon av ansvar.

## Designvalg og Læringspunkter

- **Separation of Concerns:**  
  Kontrolleren (`QRCodeRestController`) håndterer HTTP-forespørsler, mens validering og bildekonvertering er delegert til egne metoder og klasser (som `ImageConverter`). Dette fører til en ryddig og lett vedlikeholdbar kodebase.

- **Streng Inputvalidering:**  
  API-et sjekker  at brukerens input er korrekt (f.eks. at "contents" ikke er tom, at bildestørrelse er innenfor et definert område, at feilrettingsnivået og bildeformatet er gyldige). Dette sikrer informative feilmeldinger og forhindrer uventet oppførsel.

- **Integrasjon av Eksterne Biblioteker:**  
  Ved å benytte ZXing for QR-kodegenerering og Spring Boot for rask oppsett av API-et, viser prosjektet hvordan man kan integrere tredjepartsverktøy for å løse konkrete oppgaver på en effektiv måte.

## Mulige Forbedringer

- **Automatiserte Tester:**  
  Selv om prosjektet er utformet for å bestå Hyperskills interne tester, vil implementering av enhetstester og integrasjonstester gjøre applikasjonen enda mer sikrere og enklere å videreutvikle.

- **Dynamisk Utvidelse av Funksjonalitet:**  
  Fremtidige versjoner kan inkludere flere konfigurasjonsmuligheter for QR-koder (som farger og marginer) og mulighet for å legge til nye parametre dynamisk.

- **Forbedret Feilhåndtering og Logging:**  
  Videre utvikling kan fokusere på mer omfattende logging og feilhåndtering for å lette feilsøking i produksjonsmiljøer.
