
public class ComparadorCoste {

	public int compare(Object o1, Object o2) {

		Editable a1 = (Editable) o1;
		Editable a2 = (Editable) o2;

		if (a1.getCoste() > a2.getCoste()) {

			return 1;
		} else if (a1.getCoste() < a2.getCoste()) {

			return -1;

		} else {

			return 0;
		}

	}

}
