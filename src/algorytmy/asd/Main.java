package algorytmy.asd;

public class Main {

	public static void main(String[] args) {

		System.out.println(znajdzLiczbe(99999999, generatorTablicy()));
		System.out.println(binSearch(99999999, generatorTablicy()));
		
		int[] tablica = {4,7,8,5,6,1,2,9,0};
		selectionSort(tablica);
		
		for(int element : tablica) {
			System.out.print(element + " ");
		}
		System.out.println();
		
		int[] tablica2 = {4,7,8,5,6,1,2,9,0};
		insertionSort(tablica2);
		for(int element : tablica2) {
			System.out.print(element + " ");
		}

	}
	/*
	 * SelectionSort
	 * 
	 * 4,7,8,5,6,1,2,9,0
	 * 
	 * 1) 0 | 7,8,5,6,1,2,9,4 2) 0, 1 | 8,5,6,7, 2,9,4 3) 0, 1, 2 |5,6,7, 8,9,4
	 */

	public static void selectionSort(int[] tablica) {
		int minIndeks, temp;
		for (int i = 0; i < tablica.length; i++) {
			minIndeks = i;
			for (int j = i; j < tablica.length; j++) {
				if (tablica[j] < tablica[minIndeks]) {
					minIndeks = j;
				}
			}
			// znamy indeks elementu najmniejszego z ciagu nieposrotowanego
			temp = tablica[minIndeks];
			tablica[minIndeks] = tablica[i];
			tablica[i] = temp;

		}
	}
	
	//InsertionSort
	/*

	
		4 | 2,8,5,6,1,7,9,0
		
		1) 2,4 | 8,5,6,1,7,9,0
	
		2) 2,4,8 | 5,6,1,7,9,0
	
		3) 2,4,5, 8 | 6,1,7,9,0

	 */
	
	public static void insertionSort(int[] tablica) {
		
		//sortowana jako liczba, porownywana jako indeks
		int sortowana, porownywana;
		
		for(int i = 1; i < tablica.length; i++) {
			sortowana = tablica[i];
			porownywana = i - 1;
			while(porownywana >= 0 && sortowana < tablica[porownywana]) {
				tablica[porownywana + 1] = tablica[porownywana];
				porownywana--;
			}
			tablica[porownywana+1] = sortowana;
		}
	}

	// binSearch
	/*
	 * 1,4,6,7,8,[10],15,16,18,19,20
	 * 
	 * 
	 * 15,16,[18],19,20
	 * 
	 */
	public static int binSearch(int n, int[] tablica) {
		int wynik = -1, mediana, l = 0, p = tablica.length - 1, liczbaPorownan = 0;

		while (l <= p) {
			mediana = (l + p) / 2;
			liczbaPorownan++;
			if (n > tablica[mediana]) {
				l = mediana + 1;
			} else if (n < tablica[mediana]) {
				p = mediana - 1;
			} else {
				wynik = mediana;
				break;
			}
		}
		System.out.println("Liczba porównań " + liczbaPorownan);
		return wynik;
	}

	// złozonosc A(n) = Θ(n/2) = Θ(n), W(n)=(n) S(n)= Θ(1)
	public static int znajdzLiczbe(int a, int[] tablica) {

		for (int i = 0; i < tablica.length; i++) {
			if (a == tablica[i]) {
				System.out.println("Liczba porównań " + (i + 1));
				return i;
			}
		}
		return -1;
	}

	public static int[] generatorTablicy() {
		int[] tab = new int[100000000];
		for (int i = 0; i < tab.length; i++) {
			tab[i] = i;
		}
		return tab;
	}

}
