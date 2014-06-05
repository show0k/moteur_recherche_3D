moteur_recherche_3D
===================

Moteur de recherche d'image 3D fonctionant avec un servlet et utilisant JSC3D pour le rendu côté client.

# Utilisation :
Le moteur de recherche fonctionne avec des images au format wavefront (.obj) ; vous pouvez en trouver sur internet ou convertir des images existantes avec [meshconv](http://www.cs.princeton.edu/~min/meshconv/).

# Fonctionnement
* Le calcul des histogrammes des images (au format wavefront) est effectué en java côté serveur. Il est enregistré dans un fichier texte qui est chargé au démarrage ou re-crée s'il n'existe pas.
* Un servlet permet de faire le lien entre la partie serveur en java utilisant le moteur de servlet apache tomcat et la partie client en javascript.
* Lorsqu'on importe une nouvelle image, on calcule sa signature et on la compare avec celles existantes.

## Caractérisation des images
On crée une signature de chaque image en faisant un histogramme de la distance de chaque point du modèle à son centre de gravité. la distance L2 entre chaque signature nous permet de classer les images par similarité.

# Crédits 
* La base d'image 3d a été importé depuis le site de [l'université de mcgill](http://www.cim.mcgill.ca/~shape/benchMark/)
* La conversion du format off au format wavefront utilisé pour l'affichage a été effectué grâce au logiciel [meshconv](http://www.cs.princeton.edu/~min/meshconv/)
* La bibliothèque javascript JSC3D a été utilisée pour visualiser les images 3D sur les navigateurs supportant WebGL.

