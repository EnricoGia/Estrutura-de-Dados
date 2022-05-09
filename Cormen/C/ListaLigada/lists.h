#ifndef LISTA_H_DECLARED
#define LISTA_H_DECLARED

#include <stdio.h>

typedef struct
{
    int next[10];
    int key[10];
    int prev[10];
    int free[10]; // vetor dos índices livres
    int L;

} Lists;

Lists createList();
Lists createListKey();
void showLists();
void showLinkedList();
void removeKey();
void emptyList();
void fillFree();
void insertKey();
void showArray();
void editFree();

#endif