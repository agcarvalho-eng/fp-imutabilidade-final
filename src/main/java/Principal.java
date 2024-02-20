import exercicios.Cidade;
import exercicios.CidadeRecord;
import exercicios.PessoaRecord;
import exercicios.PessoaRecordShallow;

/**
 * Classe para você testar suas implementações.
 * Veja o README para mais detalhes.
 */
public class Principal {
    public static void main(final String[] args) {
        var pessoaRecordShallow = new PessoaRecordShallow("Manoel", new Cidade("Palmas"));
        pessoaRecordShallow.cidade().setNome("Gurupi");
        System.out.println(pessoaRecordShallow.nome());
        System.out.println(pessoaRecordShallow.cidade().getNome());
    }
}
