package inf4042_kechchany_hec.myusefullapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main6Activity extends Activity {

    private String[] monthsArray = {"*Rien n'est plus contagieux que la liberté.", "*La vie est un mystère qu'il faut vivre, et non un problème à résoudre.", "*Le silence est un ami qui ne trahit jamais.", "*Choisissez un travail que vous aimez et vous n'aurez pas à travailler un seul jour de votre vie.", "*Agis avec gentillesse, mais n'attends pas de la reconnaissance.", "*La nature fait les hommes semblables, la vie les rend différents.", "*Un sourire coûte moins cher que l'électricité, mais donne autant de lumière.",
            "*Plus l'espérance est grande, plus la déception est violente.", "*La connaissance s'acquiert par l'expérience, tout le reste n'est que de l'information.", "*Je crois ce que je dis, je fais ce que je crois.", "*Pas trop d'isolement ; pas trop de relations ; le juste milieu, voilà la sagesse.", "*Si je devais recommencer ma vie, je n'y voudrais rien changer ; seulement j'ouvrirais un peu plus grand les yeux.", "*On parle toujours mal quand on n'a rien à dire.","*Je suis capable du meilleur et du pire. Mais, dans le pire, c'est moi le meilleur.","*Il n'est de véritable déception que de ce qu'on aime.","*Jamais le soleil ne voit l'ombre.","*Je ne joue pas contre une équipe en particulier. Je joue pour me battre contre l'idée de perdre.","*Ceux qui vivent sont ceux qui luttent.","*La vie est un défi à relever, un bonheur à mériter, une aventure à tenter.","*Dans une prochaine vie, papa, j'aimerais te reprendre comme père."};

    private ListView monthsListView;
    private ArrayAdapter arrayAdapter;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        monthsListView = (ListView) findViewById(R.id.listView);

        // this-The current activity context.
        // Second param is the resource Id for list layout row item
        // Third param is input array
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, monthsArray);
        monthsListView.setAdapter(arrayAdapter);
    }
}
