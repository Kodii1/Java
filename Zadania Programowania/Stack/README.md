[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/Bt1ORdF2)

# Zadanie Stos i RPN

| Termin oddania   | Punkty |
| ---------------- | :----- |
| 19.11.2023 23:00 | 10     |

---

Przekroczenie terminu o **n** zajęć wiąże się z karą:

- punkty uzyskane za realizację zadania są dzielone przez **2<sup>n</sup>**.

---

## Zadanie 1: Stos

### 01 Green

Zaimplementuj klasę `Stack` implementującą ideę stosów napisów z następującymi metodami publicznymi:

- `push` wkłada jeden element na stos
- `pop` zdejmuje jeden element ze stosu i oddaje wartość tego elementu; co się ma dziać gdy, `pop` próbuje
  zdjąc element z pustego stosu?
- `peek` podobnie jak `pop` oddaje wartość elementu na szczycie stosu ale go nie zdejmuje;
  podobny problem z pustym stosem co w przypadku `pop`.
  Podstawową strukturą danych w implementacji stosu powinna być tablica. Stos nie powinien posiadać ograniczeń rozmiaru.

### 00 Red

Przygotuj testy jednostkowe dla klasy `Stack` zanim przystąpisz do implementacji tej klasy.

## Zadanie 2: RPN

### Green

Zaimplementuj klasę wyliczającą wyrażenia arytmetyczne zapisane w [Odwrotnej Notacji Polskiej](https://pl.wikipedia.org/wiki/Odwrotna_notacja_polska).
Założenia:

- wyrażenia są ciągami znaków
- program umożliwia wyliczanie wyrażeń złożonych z liczb całkowitych i operacji binarnych takich jak `+`, `-` czy `*`.
- do implementacji wykorzystaj klasę `Stack` z Zadania 1.

### Red

Przygotuj testy jednostkowe dla implementacji RPN.

---
