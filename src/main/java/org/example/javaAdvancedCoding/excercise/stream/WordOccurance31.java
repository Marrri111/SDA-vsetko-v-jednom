package org.example.javaAdvancedCoding.excercise.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordOccurance31 {
    //Write a program that will count the occurrences of each word in a
    // text file and then save the results in the form
    //of a table in a new file.
    static String tale = """
            Byla Byla jednou jedna malá vesnička obklopená zelenými lesy a šumícími potoky. Lidé v této vesničce žili šťastně a poklidně, dokud se jednoho dne nestalo něco neobvyklého.        
            Vesničku začaly navštěvovat podivné bytosti zvané Ržbáci. Tito malí tvorové měli světle zelenou kůži, velké okrouhlé oči a dlouhé tenké prsty. Přicházeli v noci a nechávali za sebou stopy svého zvláštního chování. Obyvatelé vesnice byli vyděšení a nevěděli, co si o této nové situaci myslet.                       
            Jeden statečný chlapec jménem Tomáš se rozhodl vydat do lesa a zjistit, co tyto Ržbáky přivádí do jejich vesnice. S odvahou a dobrodružným duchem se vydal do temného lesa, kde se brzy setkal s malým skřítkem Ržbákem jménem Zvonko.                       
            Zvonko Tomášovi vysvětlil, že Ržbáci přicházejí do vesnice, protože potřebují pomoc. Jejich domovem byla zapomenutá zahrada plná kouzelných bylin, které jim poskytovaly léčivé síly. Ale nedávno se stalo něco špatného, a zahrada ztratila svou magickou moc.                      
            Tomáš se rozhodl pomoci Ržbákům obnovit zahradu. S pomocí Zvonka a dalších Ržbáků sbíral byliny a hledal způsob, jak jim vrátit ztracenou magii. Po mnoha dobrodružstvích a překonání překážek se jim to nakonec podařilo.                      
            Když se vrátili do vesnice, byli obyvatelé nadšení z jejich úspěchu. Ržbáci se stali přáteli vesničanů a každoročně přicházeli, aby společně slavili obnovení magické zahrady. Tomáš se stal hrdinou vesnice a všechny děti rády poslouchaly jeho příběhy o dobrodružstvích s Ržbáky.                      
            Od té doby žili lidé a Ržbáci v harmonii a vzájemné úctě, a každý si uvědomoval důležitost pomoci a přátelství. A tak skončila pohádka o Ržbácích, kteří našli své místo ve světě díky odvaze jednoho malého chlapce.
            """;

    public static void main(String[] args) {
        String[] split = tale.split("\\W");
        Map<String, List<String>> collect = Arrays.stream(split).collect(Collectors.groupingBy(s -> s));
        collect.keySet().stream().sorted().forEach(k ->
        {
            System.out.println(k + ":" + collect.get(k).size());
        });
    }
}
