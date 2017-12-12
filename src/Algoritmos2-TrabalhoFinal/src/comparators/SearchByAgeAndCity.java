package comparators;

import java.util.Comparator;

import model.Aluno;

public class SearchByAgeAndCity implements Comparator<Aluno> {

	@Override
	public int compare(Aluno o1, Aluno o2) {
		// TODO Auto-generated method stub
		if (o1.getIdade() == o2.getIdade() && o1.getCidade().equals(o2.getCidade())) {
			return o1.getIdade();
		} else {
			return 0;
		}
	}

}
