#include <stdio.h>
#include "lists.h"

Lists s1;

Lists createList(int n[10], int k[10], int p[10])
{
  Lists l1;
  for (int i = 0; i < 10; i++)
  {
    l1.next[i] = n[i];
    l1.key[i] = k[i];
    l1.prev[i] = p[i];
  }
  return l1;
}

void emptyList()
{
  for (int i = 0; i < 10; i++)
  {
    removeKey(s1.key[i]);
    showLinkedList();
  }
}

Lists createListKey(int k[10])
{
  Lists l1;

  for (int i = 0; i < 10; i++)
  {
    l1.next[i] = i + 1;
    l1.key[i] = k[i];
    l1.prev[i] = i - 1;
  }
  l1.next[9] = -1;

  return l1;
}

void showLists()
{
  printf("\nNext -->");
  for (int i = 0; i < 10; i++)
  {
    printf("%3d ", s1.next[i]);
  }

  printf("\nKey  -->");

  for (int i = 0; i < 10; i++)
  {
    printf("%3d ", s1.key[i]);
  }

  printf("\nPrev -->");

  for (int i = 0; i < 10; i++)
  {
    printf("%3d ", s1.prev[i]);
  }
  printf("\n");
}

void showLinkedList()
{
  printf("\n");

  int nextIndex = s1.L;
  printf("List -->");
  while (nextIndex != -1)
  {
    printf("%3d ", s1.key[nextIndex]);
    nextIndex = s1.next[nextIndex];
  }
  printf("\n");
}

void insertKey(int key)
{
  for (int i = 0; i < 10; i++)
  {
    if (s1.free[i] != -1)
    {
      s1.key[s1.free[i]] = key;
      int nextIndex = s1.L;
      // Percorre a lista até encontrar o alvo ou até o fim
      while (s1.next[nextIndex] != -1)
      {
        nextIndex = s1.next[nextIndex];
      }
      s1.next[nextIndex] = s1.free[i];
      s1.prev[s1.free[i]] = nextIndex;
      s1.free[i] = -1;
      return;
    }
  }
  printf("\nPassou do limite!");
}

void showArray(int array[])
{
  for (int i = 0; i < 10; i++)
  {
    printf("%3d ", array[i]);
  }
}

void fillFree()
{

  for (int i = 0; i < 10; i++)
  {
    s1.free[i] = -1;
  }
}

void editFree(int index)
{
  for (int i = 0; i < 10; i++)
  {
    if (s1.free[i] == -1)
    {
      s1.free[i] = index;
      return;
    }
  }
}

void removeKey(int target)
{

  int nextIndex = s1.L;
  int targetIndex = -1;

  // Percorre a lista até encontrar o alvo ou até o fim
  while (s1.key[nextIndex] != target && nextIndex != -1)
  {
    nextIndex = s1.next[nextIndex];
  }
  // Verifica se encontrou o alvo
  if (s1.key[nextIndex] != target)
  {
    return;
  }

  targetIndex = nextIndex;
  s1.key[targetIndex] = -1;

  // Duas variaveis para facilitar leitura
  int targetNextIndex = s1.next[targetIndex];
  int targetPrevIndex = s1.prev[targetIndex];

  // Verifica se o alvo é o primeiro elemento da lista
  if (s1.prev[targetIndex] == -1)
  {
    s1.L = targetNextIndex;
    s1.prev[targetNextIndex] = -1;
  }
  // Verifica se o alvo é o ultimo elemento da lista
  else if (s1.next[targetIndex] == -1)
  {
    s1.next[targetPrevIndex] = -1;
  }

  else
  {
    s1.next[targetPrevIndex] = targetNextIndex;
    s1.prev[targetNextIndex] = targetPrevIndex;
  }
  s1.next[targetIndex] = -1;
  s1.prev[targetIndex] = -1;
  editFree(targetIndex);

  return;
}