XspeedIt
========

XspeedIt est une société d'import / export ayant robotisé toute sa chaîne d'emballage de colis.  
Elle souhaite trouver un algorithme permettant à ses robots d'optimiser le nombre de cartons d'emballage utilisés.

Les articles à emballer sont de taille variable, représentée par un entier compris entre 1 et 9.  
Chaque carton a une capacité de contenance de `10`.  
Ainsi, un carton peut par exemple contenir un article de taille 3, un article de taille 1, et un article de taille 6.

La chaîne d'articles à emballer est représentée par une suite de chiffres, chacun représentant un article par sa taille.  
Après traitement par le robot d'emballage, la chaîne est séparée par des `/` pour représenter les articles contenus dans un carton.

*Exemple*  
```python
Chaîne d'articles en entrée : 163841689525773  
Chaîne d'articles emballés  : 163/8/41/6/8/9/52/5/7/73
```

Objectif
--------

Implémenter une méthode permettant de grouper les articles pour obtenir des cartons de taille maximum `10`.
L'ordre des cartons et des articles n'a pas d'importance.

> L'algorithme du robot d'emballage peut rester très basique (prendre les articles les uns après les autres, les mettre dans un carton, si la taille totale dépasse la contenance du carton mettre l'article dans le carton suivant...) ou chercher à optimiser le nombre de cartons utilisés.

*Exemples*  
```
Articles      : 163841689525773  
Robot simple  : 163/8/41/6/8/9/52/5/7/73 => 10 cartons utilisés  
Robot optimisé: 163/82/46/19/8/55/73/7   => 8  cartons utilisés
```
