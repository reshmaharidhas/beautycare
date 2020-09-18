package com.reshmaharidhas.reshma.beautycare;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

public class GlossaryList extends AppCompatActivity {

    ListView list;
    String[] itemname ={
            "Amla-Cheap source of Vitamin C. It stalls premature greying of hair.",
            "Apple Cider Vinegar- It restores the acid mantle to the skin, and can be used diluted as a skin tonic.",
            "Avocado Oil-Rich and nourishing with high vitamin contents. It is used in nourishing creams.",
            "Barley-It has nutritional value and rich in iron and Vitamin B. It cools and the body, strengthen the nerves.",
            "Basil-An aromatic herb. Basil prevents appearance of blackheads.",
            "Beeswax-An ester wax ideal for face creams.It can deal with inflammation of all types.",
            "Benzoin-It has antisepic properties.Tincture of benzoin is the liquid used in creams and skin tonics.",
            "Bergamot Oil-An aromatic herb. It is a volatile oil and used to perfume colognes and toilet water. Helps in tanning the skin.",
            "Bicarbonate of Soda-An acid salt of carbonic acid used for cosmetics and manufacture of toothpaste.",
            "Blackberry-Good for beauty care and health. The leaves are mildly aberient and accredited with sound tonic qualities.",
            "Borax-It has mild detergent and antiseptic properties. Used as emulsifier in conjunction with bees-wax.",
            "Brewers Yeast-A rich source of Vitamin 'B' and protein. It helps acne and dryness of skin and scalp. Used as a cleanser in face mask",
            "Camomile-Camomile dissolves tumours, heals ulcers, expels worms, banishes tiredness and treats many female disorders.",
            "Cocoa Butter-Solidified waxy oil from the roasted cocoa beans, used as a lubricant in massage creams. It is good for dry skin.",
            "Comfrey-A herb used to treat wounds and for repairing broken bones and battered bodies.",
            "Corn Oil-A heavy vegetable oil which can be used in body and face creams.",
            "Dandelion Leaves(kukraundha)-A herb with leaves resembling thoes of tobacco plant and yellow flowers. Good remedy for resolving inflammation of all kinds",
            "Elder flowers-Elder trees combined with honey clears troubled skin. It soothes all burns and scalds.",
            "Emulsifying Wax-Very useful for stabilizing creams.",
            "Fullers Earth (multani mitti) - Yellowish, white absorbant clay, rich in minerals. Used in face masks for thickening and cleansing,drawing & stimulating properties. A paste on the skin cures prickly heat.",
            "Gelatine-A rich source of protein. Used for hair conditioning or diluted as setting lotion and nail hardening cream.",
            "Henna (mehndi)-An astringent herb with cooling properties. Leaves of henna helps with pimples and boils on the skin. Used as a hair conditioner and hair dye.",
            "Hollyhock-Have soothing properties, and are used for preparing skin tonics.",
            "Honey-Healing, nourishing and softening. It is used in masks, creams and lotions.",
            "Horsetail-Horsetail soothes pains and as a lotion prompts the rapid healing of sores, wounds, shingles.etc.",
            "Indian Lilac (bakain) - A tree resembling Neem. Leaves of tree has blood purifying properties. Recommended for scabies, ringworm, leprosy, leucoderma.",
            "Kaolin-Fine white clay. Used for absorption purposes in masks.",
            "Lanolin (thick fat)- Used in skin foods for moisturizing and softening effects.",
            "Lavender-Used for scenting bath water and in perfumes.",
            "Lecithin (yellow powder)- Highly nutritious product found in egg yolk and soyabeans.",
            "Linseed-Seeds and oil of this plant used as a medicine. Useful remedy for cough, asthma and inflammation. Ointment made from it relieves pain from burns.",
            "Marigold-A disinfectant herb used as an effective treatment for ulcers and open sores. Flowers can be eaten raw or applied in lotions. Cures varicose veins." +
                    "As a lotion, marigold infusion useful for oily skin and complexion. Helps cure eczema and ringworm.",
            "Oak-Leaves soothe inflammation. In the bath, leaves are deodarant and relaxing.",
            "Oatmeal-Cleansing and soothing meal, used in face masks.","Oleander-Bark and root of the plant cures skin disorders, purifies " +
            "the blood. Oil is useful in case of scabies and ringworm.",
            "Olive oil- A poly-unsaturated vegetable oil used in nourishing creams.",
            "Petroleum Jelly - A lubricating jelly used in cleansing creams.",
            "Raspberry - Cleansing agent. The crushed fruit is used in masks and the juice in erasing blemishes.",
            "Rosewater (gulab jal) - Scented water made from rose petals. Widely used in skin tonics and creams.",
            "Safflower oil-A rich poly-unsaturated oil suitable for all nourishing creams.",
            "Sesame oil - A poly-unsaturated oil used in all cosmetics especially sun-tanning creams as it absorbs UV rays. Crushed leaves excellent " +
                    "remedy for dandruff.",
            "Soapwort (saboon buti) - Used as an emulsifying agent.",
            "Tea leaves- Contains tannin which has a soothing and healing effect. Used in sun creams to prevent burning.",
            "Turmeric-Used to cure injuries and prevents inflammation of skin.",
            "Wheat germ oil - A rich unsaturated oil, rich in Vitamin E. It has healing properties.",
            "Witch Hazel-Widely used in skin tonics for its astringent properties."

    };
    Integer imgid[]={R.drawable.amla,R.drawable.applecidervinegar,R.drawable.avocadooil,R.drawable.barley,R.drawable.basil,R.drawable.beeswax,
    R.drawable.benzoin,R.drawable.bergamotoil,R.drawable.bicarbonateofsoda,R.drawable.blackberry,R.drawable.borax ,R.drawable.brewersyeast,
    R.drawable.camomile,R.drawable.cocoabutter,R.drawable.comfrey,R.drawable.cornoil,R.drawable.dandelion,R.drawable.elderflower,
    R.drawable.emulsifyingwax,R.drawable.fullers_earth,R.drawable.gelatine,R.drawable.henna,R.drawable.hollyhock,R.drawable.honey,
    R.drawable.horsetail,R.drawable.indianlilac,R.drawable.kaolin,R.drawable.lanolin,R.drawable.lavender,R.drawable.lecithin,R.drawable.linseed,
    R.drawable.marigold,R.drawable.oak,R.drawable.oatmeal,R.drawable.oleander,R.drawable.oliveoil,R.drawable.petroleumjelly,R.drawable.raspberry,
            R.drawable.rosewater,R.drawable.saffloweroil,R.drawable.sesameoil,R.drawable.soapwortroot,R.drawable.tealeaves,R.drawable.turmeric,
            R.drawable.wheatgermoil,R.drawable.witchhazel
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glossary_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CustomListAdapter adapter=new CustomListAdapter(this,itemname,imgid);
        list=(ListView)findViewById(R.id.listview);
        list.setAdapter(adapter);
    }

}
