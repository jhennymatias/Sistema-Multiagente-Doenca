// Agent pessoa in project sistemaMultiagenteCovid

/* Initial beliefs and rules */
saudavel.
doentes.
ambiente(fechado).
vacinado.
mascara(pff2).
positivo(0).
posicao(x,y).

/* Initial goals */
!estou_contaminado.

+!estou_contaminado:
	saudavel & doentes & ambiente(fechado) &
	vacinado & mascara(pff2) & positivo(0) 
	<- 
	-saude(saudavel);
	+saude(doente);
	teste.teste(True, False, "Aberto", True, "PFF2", 0, Result)
	.print("Tem XX.XX% de chance de eu estar doente", Result )
.


/* Plans */

+!start : true <- .print("hello world.").
