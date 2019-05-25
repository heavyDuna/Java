package Listas;

import java.util.Arrays;

public class Lista {

	private Nodo com;

	public Lista() {

		this.com = null;

	}

	public Nodo getCom() {

		return this.com;
	}

	public void setCom(Nodo com) {
		this.com = com;
	}

	public boolean estaVacia() {

		return com == null;
	}

	public void invertir(Lista l) {

		Nodo p, q, ultimo;
		p = this.com;
		q = this.com;

		while (p.getSig() != null) {

			p = p.getSig();

		}

		ultimo = p;
		// System.out.println(ultimo);
		// System.out.println(q);

		while (ultimo != com) {

			addFinalNodo(q.getInfo());

			q = q.getSig();
			
			System.out.println(q);

		}
		
		System.out.println(l);

	}

	public void addPrincipio(int num) {

		Nodo nuevo = new Nodo();
		nuevo.setInfo(num);
		nuevo.setSig(this.com);
		this.com = nuevo;

	}

	public void addFinal(int num) {

		Nodo nuevo = new Nodo();
		nuevo.setInfo(num);
		Nodo p;
		p = this.com;

		while (p.getSig() != null) {

			p = p.getSig();
		}

		nuevo.setSig(null);
		p.setSig(nuevo);
	}
	
	public void addFinalNodo(int num) {

		Nodo nuevo = new Nodo();
		nuevo.setInfo(num);
		Nodo p;
		p = this.com;

		while (p.getSig() != null) {

			p = p.getSig();
		}

		nuevo.setSig(null);
		p.setSig(nuevo);
	}

	public void borrar(int dato) {

		Nodo p, aux;
		boolean encontrado = false;

		if (this.com == null) {

			System.out.println("Lista vacía");

		} else {

			aux = this.com;
			p = com.getSig();

			if (com.getInfo() == dato) {
				com = com.getSig();
			} else {

				while (p != null && encontrado == false) {
					if (p.getInfo() == dato) {
						encontrado = true;
					} else {
						aux = aux.getSig();
						p = p.getSig();
					}
				}

				if (encontrado == true) {

					aux.setSig(p.getSig());

				}
			}

		}
	}

	public void recorrer(int dato) {

		Nodo p;
		p = this.com;

		while (p != null) {

			if (p.getInfo() < dato && p.getSig().getInfo() > dato) {

				Nodo nuevo = new Nodo();
				nuevo.setInfo(dato);

				nuevo.setSig(p.getSig());
				p.setSig(nuevo);

			}

			p = p.getSig();

		}
	}

	public static int[] descomponerEnArray(int numero) {

		int n = 6;
		int resto = 0;
		int[] num = new int[n];

		for (int i = n - 1; i >= 0; i--) {

			resto = numero % 10;
			num[i] = resto;

			numero = numero / 10;

		}

		return num;

	}

	public Nodo buscarPosicionParaElNodo(Nodo nuevo) {

		Nodo p;
		p = com;

		while (p.getSig() != null && p.getInfo() < nuevo.getInfo()) {

			p = p.getSig();
		}

		if (p.getSig() == null) {
			return p;
		} else {
			return buscarPosicionAnterior(p);
		}

	}

	public Nodo buscarPosicionAnterior(Nodo p) {

		Nodo q = com;

		while (q.getSig() != p) {

			q = q.getSig();
		}
		return q;
	}

	public void insertarNodoEnLaPosicion(Nodo nodoAInsertar, Nodo posicion) {

		nodoAInsertar.setSig(posicion.getSig());
		posicion.setSig(nodoAInsertar);

	}

	public Lista convertirEnLista(int num) {

		int[] numeros = descomponerEnArray(num);
		System.out.println(Arrays.toString(numeros));

		Lista l = new Lista();

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("LISTAAA: " + l);

			if (numeros[i] != 0) {

				Nodo nuevo = new Nodo();
				nuevo.setInfo(numeros[i]);

				if (l.estaVacia()) {
					l.setCom(nuevo);

				} else if (nuevo.getInfo() < l.getCom().getInfo()) {
					nuevo.setSig(l.getCom());
					l.setCom(nuevo);
				} else {
					Nodo pos = l.buscarPosicionParaElNodo(nuevo);
					System.out.println("POS NODO: " + pos);
					l.insertarNodoEnLaPosicion(nuevo, pos);
				}

			}

		}

		return l;

	}

	public void maximaDist(int dato) {

		Nodo p;
		p = this.com;

		boolean encontrado = false;
		int dist = 0;
		int max = 0;

		while (p != null) {

			if (p.getInfo() == dato) {

				encontrado = true;

				if (dist >= max) {
					max = dist;
				}

				dist = 1;

			} else if (encontrado == true) {

				dist++;
			}

			p = p.getSig();
		}

		System.out.println(max);

	}

	public void DatoUltimoNodo(Lista l) {

		Nodo p;
		p = this.com;

		int numNodos = 0;
		int infoUltNodo = 0;

		while (p != null) {

			if (p.getSig() == null) {

				numNodos++;

				infoUltNodo = p.getInfo();

				if (numNodos == infoUltNodo) {

					System.out.println("CERO");

				} else if (numNodos > infoUltNodo) {

					System.out.println("-UNO");

				} else if (numNodos < infoUltNodo) {
					System.out.println("UNO");
				}
			} else {

				numNodos++;

			}

			p = p.getSig();

		}

	}

	public void InsertarCeroDespuesDeSuma(Lista lista) {

		Nodo p;
		p = this.com;

		int suma = 0;

		while (p != null) {

			suma = suma + p.getInfo();

			p = p.getSig();

		}

		System.out.println("La suma es: " + suma);

		Nodo n;
		n = this.getCom();

		while (n != null) {

			if (n.getInfo() == suma) {

				Nodo cero = new Nodo();
				cero.setInfo(0);

				cero.setSig(n.getSig());
				n.setSig(cero);

			}
			n = n.getSig();
		}

		System.out.println("Nueva lista: " + lista);

	}

	public int montanaRusa(Lista montaña) {

		Nodo p;
		p = this.com;

		int total = 0;
		int primerNodo = 0;

		while (p != null && p.getSig() != null) {

			if (p == this.com) {

				primerNodo = p.getInfo();

				total = primerNodo;

			}

			if (p.getSig().getInfo() > p.getInfo()) {

				total = total + p.getSig().getInfo();

			} else {

				total = total - p.getSig().getInfo();
			}

			p = p.getSig();

		}

		return total;

	}

	public boolean sonIguales(Lista l1, Lista l2) {

		Nodo p, q;
		p = l1.getCom();

		boolean encontrado = false;
		int coincidencias = 0;

		while (p != null) {

			q = l2.getCom();

			while (q != null) {

				if (p.getInfo() == q.getInfo()) {

					encontrado = true;
					coincidencias++;

				}

				q = q.getSig();

			}

			p = p.getSig();

		}
		System.out.println("coincidencias: " + coincidencias);
		return encontrado;

	}

	public Lista secuenciaMasLarga(Lista l) {

		Lista listaNueva = new Lista();

		Nodo p, q, qFinal;
		p = l.getCom();
		q = p;
		qFinal = q;

		int cont = 1;
		int numero = 0;
		int total = 0;
		int ganadorNumero = 0;

		while (p != null && p.getSig() != null) {

			numero = p.getInfo();

			if (p.getInfo() == p.getSig().getInfo()) {

				cont++;

			} else {

				if (cont > total) {
					qFinal = q;
				}

				q = p.getSig();

				if (cont > total) {

					total = cont;
					ganadorNumero = numero;

					cont = 1;

				}

			}

			p = p.getSig();

		}

		Nodo x;
		x = qFinal;
		int i = 0;

		while (i < total) {

			listaNueva.addPrincipio(x.getInfo());
			l.borrar(x.getInfo());

			x = x.getSig();
			i++;
		}

		System.out.println(l);

		return listaNueva;

	}

	public String toString() {

		String l = "Lista";
		Nodo p = this.com;

		while (p != null) {

			l = l + p;
			p = p.getSig();
		}

		return l;

	}

}
