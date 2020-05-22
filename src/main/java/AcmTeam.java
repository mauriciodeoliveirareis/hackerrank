import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AcmTeam {
    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic, Integer numberOfAtendees, Integer numberOfTopics) {

        Map<Integer, Set<Integer>> atendeesSkillMap = toAtendeesSkillMap(topic, numberOfAtendees);
        int maxNumberOfTopics = 0;
        int maxNumberOfTeams = 0;

        for(int x = 0; x < numberOfAtendees; x++) {
            for (int y = x+1; y < numberOfAtendees; y++) {
                Set<Integer> teamSkillSet = new HashSet<>();
                teamSkillSet.addAll(atendeesSkillMap.get(x));
                teamSkillSet.addAll(atendeesSkillMap.get(y));
                if (teamSkillSet.size() == maxNumberOfTopics) maxNumberOfTeams++;
                else if (teamSkillSet.size() > maxNumberOfTopics) {
                    maxNumberOfTopics = teamSkillSet.size();
                    maxNumberOfTeams = 1;
                }
            }
        }
        int[] output = {maxNumberOfTopics, maxNumberOfTeams};
        return output;


    }

    private static Map<Integer, Set<Integer>> toAtendeesSkillMap(String[] topic, Integer numberOfAtendees) {
        Map<Integer, Set<Integer>> atendeesSkillMap = new HashMap<>();
        for(int x = 0; x < numberOfAtendees; x++) {
            String[] atendeeSkills = topic[x].split("");
            for (int skillIndex =0; skillIndex< atendeeSkills.length; skillIndex++) {
                atendeesSkillMap.putIfAbsent(x, new HashSet<>());
                if(Byte.parseByte(atendeeSkills[skillIndex]) == 1)
                    atendeesSkillMap.get(x).add(skillIndex);
            }
        }
        return atendeesSkillMap;
    }


}
