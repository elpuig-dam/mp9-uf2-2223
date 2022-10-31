## Tasques
<hr>

### Setmana del 24/10-30/10
- Exercicis Callable, Runnable i Executors

TODO

- [X] Transformar la implementació del exercici [Callable Multiplicació](src/a1/Multiplicacio.java) en una implementació sense fer servir processos. (Sense Callable ni Executor)
- [X] Transformar la implementació [Alumne](src/a1/Alumne.java) i [Notes](src/a1/Notes.java) en una execució concurrent.
- [ ] Exercici Paletes i FerParet  
  > Tenim uns paletes que tenen la tasca de construir una paret a base de posar maons.
  > Podeu veure el codi als fitxers [Paleta.java](src/a1/Paleta.java) i [FerParet.java](src/a1/FerParet.java).
  > Volem adaptar aquest codi perquè els paletes treballin alhora i no com ara, que fins que un paleta no ha posat els seus maons no continua l'altre.  
  > *_Atenció: fer servir Runnable en comptes de Callable i un ThreadPoolExecutor (NO un ScheduledThreadPool)_
- [ ] Cursa dde cargols  
  > Entendre l'exercici der la cursa de cargols amb ScheduledThreadPool.
  > Fitxers: [Cargol](src/a1/Cargol.java), [Monitor Cargols](src/a1/MonitorCargols.java) i [Cursa de Cargols](src/a1/CursaCargols.java)