import java.time.LocalDate;

import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Curso curso1 = new Curso();
        curso1.setTitle("Programação Java");
        curso1.setDescription("Sintaxes básicas");
        curso1.setCourseLoad(60);
        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitle("Programação C#");
        mentoria1.setDescription("APS.NET");
        mentoria1.setDate(LocalDate.now());
        System.out.println(mentoria1);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setName("Java IA");
        bootcamp1.setDescription("Aprendendo tudo de Java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(mentoria1);

        Dev devAlexandre = new Dev();
        devAlexandre.setName("Alexandre");
        devAlexandre.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos: " + devAlexandre.getConteudosInscritos());
        devAlexandre.progress();
        System.out.println("Conteúdos Concluídos: " + devAlexandre.getConteudosConcluidos());

        Dev devBianca = new Dev();
        devBianca.setName("Bianca" );
        devBianca.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos: " + devBianca.getConteudosInscritos());
        devBianca.progress();
        System.out.println("Conteúdos Concluídos: " + devBianca.getConteudosConcluidos());
    }
}
