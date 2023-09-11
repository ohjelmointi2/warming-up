# Kurssin lämmittelytehtävät

Tervetuloa Ohjelmointi 2 -kurssin lämmittelytehtäviin! Tämä repositorio sisältää joukon Java-harjoituksia, jotka auttavat sinua kertaamaan Ohjelmointi 1 -opintojakson sisältöjä ja perehtymään jatkokurssin harjoitusten tekniseen toteutukseen. Tässä repositoriossa käsitellään kolmea pääaihetta:

1. Perustyypit
2. Kokoelmat
3. Objektit ja Luokat

Jokainen aihe on jaoteltu omaan Java-pakettiin. Tässä README:ssä on ohjeet siitä, miten voit aloittaa, suorittaa harjoitukset ja ajaa valmiiksi kirjoitetut JUnit-testit tarkistaaksesi ratkaisusi.


## Aloittaminen

1. **Kloonaa repositorio**: Kloonaa Git-repositorio paikalliselle koneellesi. Huom! Harjoitus täytyy tehdä omassa kopiossasi, eli varmista, että repositorion osoitteessa on mukana oma GitHub-käyttäjätunnuksesi! Tarkemmat ohjeet oman kopion luomiseksi löydät opintojakson ohjeista.

   ```sh
   git clone https://github.com/varmista-etta-github-tunnuksesi-on-repositorion-osoitteessa.git
   ```

1. **Kirjoita Koodisi:** Avaa kloonaamasi hakemisto VS Code -koodieditoriin.

    Jokainen aihe on jaettu omaan pakettiin [src/main/java](./src/main/java/)-hakemistossa. Kirjoita Java-koodisi saadaksesi harjoitukset valmiiksi. Suosittelemme tekemään harjoitukset järjestyksessä, mutta voit myös jättää tehtäviä välistä.

    Tehtävästä riippuen luokissa olevat valmiit metodit ovat joko puutteellisia tai virheellisiä. Tehtävänäsi on toteuttaa nämä metodit kommentteina kirjoitettujan tehtävänantojen mukaisesti.

    Saat kirjoittaa uusia metodeita, mutta **et saa muuttaa olemassa olevien metodien nimiä, parametreja tai paluuarvoja**. Näiden muuttaminen vaikuttaa automaattisiin testeihin, jotka eivät välttämättä käänny tekemiesi muutosten jälkeen.

1. **Testaa Ratkaisusi:** Tarkistaaksesi, ovatko ratkaisusi oikein, olemme tarjonneet valmiiksi kirjoitettuja JUnit-testejä. Nämä testit sijaitsevat [src/test/java](./src/test/java/)-hakemistossa. Sinun ei tarvitse muokata näitä testejä; ne on suunniteltu arvioimaan toteutuksiasi automaattisesti.

    Käytämme Gradle-työkalua testien suorittamiseen. Noudata näitä ohjeita testien ajoon:

    1. Avaa terminaali ja siirry tämän projektin juurihakemistoon.

    1. Suorita seuraava Gradle-komento kaikkien testien suorittamiseksi:

        ```sh
        ./gradlew test       # unix
        gradlew.bat test     # windows
        ```

        Tämä komento kääntää koodisi, suorittaa JUnit-testit ja antaa palautetta siitä, ovatko toteutuksesi oikein.

    1. Suoritettuasi testit näet yhteenvedon testituloksista terminaalissa. Kiinnitä erityistä huomiota mahdollisiin virheisiin tai epäonnistumisiin, sillä ne osoittavat ongelmia koodissasi, jotka tulee korjata.

Tsemppiä koodaukseen!

---

Tämä README-tiedosto on luotu ChatGPT:n avulla.
