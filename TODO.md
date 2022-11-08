## Tasques
<hr>

### Setmana del 24/10-30/10
- Exercicis Callable, Runnable i Executors

TODO

- [X] Transformar la implementació del exercici [Callable Multiplicació](src/a1/Multiplicacio.java) en una implementació sense fer servir processos. (Sense Callable ni Executor)
- [X] Transformar la implementació [Alumne](src/a1/Alumne.java) i [Notes](src/a1/Notes.java) en una execució concurrent.
- [x] Exercici Paletes i FerParet  
  > Tenim uns paletes que tenen la tasca de construir una paret a base de posar maons.
  > Podeu veure el codi als fitxers [Paleta.java](src/a1/Paleta.java) i [FerParet.java](src/a1/FerParet.java).
  > Volem adaptar aquest codi perquè els paletes treballin alhora i no com ara, que fins que un paleta no ha posat els seus maons no continua l'altre.  
  > *_Atenció: fer servir Runnable en comptes de Callable i un ThreadPoolExecutor (NO un ScheduledThreadPool)_
- [x] Cursa dde cargols  
  > Entendre l'exercici der la cursa de cargols amb ScheduledThreadPool.
  > Fitxers: [Cargol](src/a1/Cargol.java), [Monitor Cargols](src/a1/MonitorCargols.java) i [Cursa de Cargols](src/a1/CursaCargols.java)

<hr>

### Setmana del 02/11-04/11

TODO  

- [x]  Supermercat
   > En un *supermercat* hi tenim diverses caixes que quan els hi arriba un client calculen el preu total de tot el seu
   > carro de la compra:
   > - El [Client](src/a1/Client.java) ha de tenir un nom i una llista dels preus dels productes(floats) que representa tot el que ha posat al carro.  
   > - Una Caixa rep un Client i calcula el preu total de tots els productes que hi ha a la llista, després imprimeix el
  resultat.
   > - Com que hi ha diversos clients, cada client és assignat a una caixa diferent. 
   > - Les caixes treballen alhora,  paral·lelament, però els clients d'una caixa atenen als clients seqüencialment.
   > - Fer un programa *MainSupermercat* per simular el funcionament explicat, creant com a mínim dos clients amb la seva
  llista de productes, i dues caixes, una per cada client.
   > - Al final imprimeix el que ha de pagar cada client.

- [ ]  Partida/Joc (ScheduledThreadPool)
   > - Jugador (nom, punts)
   > - DonarPunts (procés) a un jugador cada x segons (decidit per el executorService)
   > - LlegirPunts (procés) d'un jugador per anar informant quants punts acumulats porta, cada x temsp.
   > - Main -> Mínim 2 Jugadors amb els seus processos corresponents per obtenir punts i poder veure quants punts porten acumulats
   > - Main -> Cal treure una classificació final amb els punts aconseguits per cada jugador  

