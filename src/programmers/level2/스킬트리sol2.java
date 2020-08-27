package programmers.level2;

public class 스킬트리sol2 {
    public int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;

        for(int i=0;i<skill_trees.length;i++){
            if(skill.indexOf(skill_trees[i].replaceAll("[^"+skill+"]",""))!=0){
                answer--;
            }
        }

        return answer;
    }
}
 /*ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
        //ArrayList<String> skillTrees = new ArrayList<String>();
        Iterator<String> it = skillTrees.iterator();

        while (it.hasNext()) {
            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
                it.remove();
            }
        }
        answer = skillTrees.size();*/