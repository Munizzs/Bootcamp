import com.projeto.bootcamp.dominio.Bootcamp;
import com.projeto.bootcamp.dominio.Curso;
import com.projeto.bootcamp.dominio.Dev;
import com.projeto.bootcamp.dominio.Mentoria;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição curso Javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

        Bootcamp bootcamp =new Bootcamp();

        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Maria");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos: "+dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteúdos incritos: "+dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: "+ dev1.getConteudosConcluidos());
        System.out.println("XP: "+dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos: "+ dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos incritos: "+dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: "+ dev2.getConteudosConcluidos());
        System.out.println("XP: "+dev2.calcularTotalXp());
    }
}
