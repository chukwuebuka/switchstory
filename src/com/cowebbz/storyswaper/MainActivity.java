package com.cowebbz.storyswaper;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	Button btn;
	TextView title, body;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn = (Button) findViewById(R.id.button1);
		title = (TextView) findViewById(R.id.title);
		body = (TextView) findViewById(R.id.body);
		final Story[] storybook = new Story[9];
		storybook[0] = new Story(
				"Queen Niella – Love Of God",
				"Queen Niella PH based Artist who Hails from owerri in Imo State "
						+ "drops her first Single title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist "
						+ "who Hails from owerri in Imo State drops her first Single title: Love Of God Produced by PH famous producer"
						+ " @donbazQueen Niella PH based Artist who Hails from owerri in Imo State drops her first Sin"
						+ "gle title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist who Hails from owerri in Imo State "
						+ "drops her first Single title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist "
						+ "who Hails from owerri in Imo State drops her first Single title: Love Of God Produced by PH famous producer"
						+ " @donbazQueen Niella PH based Artist who Hails from owerri in Imo State drops her first Sin"
						+ "gle title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist who Hails from owerri in Imo State "
						+ "drops her first Single title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist "
						+ "who Hails from owerri in Imo State drops her first Single title: Love Of God Produced by PH famous producer"
						+ " @donbazQueen Niella PH based Artist who Hails from owerri in Imo State drops her first Sin"
						+ "gle title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist who Hails from owerri in Imo State "
						+ "drops her first Single title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist "
						+ "who Hails from owerri in Imo State drops her first Single title: Love Of God Produced by PH famous producer"
						+ " @donbazQueen Niella PH based Artist who Hails from owerri in Imo State drops her first Sin"
						+ "gle title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist who Hails from owerri in Imo State "
						+ "drops her first Single title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist "
						+ "who Hails from owerri in Imo State drops her first Single title: Love Of God Produced by PH famous producer"
						+ " @donbazQueen Niella PH based Artist who Hails from owerri in Imo State drops her first Sin"
						+ "gle title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist who Hails from owerri in Imo State "
						+ "drops her first Single title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist "
						+ "who Hails from owerri in Imo State drops her first Single title: Love Of God Produced by PH famous producer"
						+ " @donbazQueen Niella PH based Artist who Hails from owerri in Imo State drops her first Sin"
						+ "gle title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist who Hails from owerri in Imo State "
						+ "drops her first Single title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist "
						+ "who Hails from owerri in Imo State drops her first Single title: Love Of God Produced by PH famous producer"
						+ " @donbazQueen Niella PH based Artist who Hails from owerri in Imo State drops her first Sin"
						+ "gle title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist who Hails from owerri in Imo State "
						+ "drops her first Single title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist "
						+ "who Hails from owerri in Imo State drops her first Single title: Love Of God Produced by PH famous producer"
						+ " @donbazQueen Niella PH based Artist who Hails from owerri in Imo State drops her first Sin"
						+ "gle title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist who Hails from owerri in Imo State "
						+ "drops her first Single title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist "
						+ "who Hails from owerri in Imo State drops her first Single title: Love Of God Produced by PH famous producer"
						+ " @donbazQueen Niella PH based Artist who Hails from owerri in Imo State drops her first Sin"
						+ "gle title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist who Hails from owerri in Imo State "
						+ "drops her first Single title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist "
						+ "who Hails from owerri in Imo State drops her first Single title: Love Of God Produced by PH famous producer"
						+ " @donbazQueen Niella PH based Artist who Hails from owerri in Imo State drops her first Sin"
						+ "gle title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist who Hails from owerri in Imo State "
						+ "drops her first Single title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist "
						+ "who Hails from owerri in Imo State drops her first Single title: Love Of God Produced by PH famous producer"
						+ " @donbazQueen Niella PH based Artist who Hails from owerri in Imo State drops her first Sin"
						+ "gle title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist who Hails from owerri in Imo State "
						+ "drops her first Single title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist "
						+ "who Hails from owerri in Imo State drops her first Single title: Love Of God Produced by PH famous producer"
						+ " @donbazQueen Niella PH based Artist who Hails from owerri in Imo State drops her first Sin"
						+ "gle title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist who Hails from owerri in Imo State "
						+ "drops her first Single title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist "
						+ "who Hails from owerri in Imo State drops her first Single title: Love Of God Produced by PH famous producer"
						+ " @donbazQueen Niella PH based Artist who Hails from owerri in Imo State drops her first Sin"
						+ "gle title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist who Hails from owerri in Imo State "
						+ "drops her first Single title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist "
						+ "who Hails from owerri in Imo State drops her first Single title: Love Of God Produced by PH famous producer"
						+ " @donbazQueen Niella PH based Artist who Hails from owerri in Imo State drops her first Sin"
						+ "gle title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist who Hails from owerri in Imo State "
						+ "drops her first Single title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist "
						+ "who Hails from owerri in Imo State drops her first Single title: Love Of God Produced by PH famous producer"
						+ " @donbazQueen Niella PH based Artist who Hails from owerri in Imo State drops her first Sin"
						+ "gle title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist who Hails from owerri in Imo State "
						+ "drops her first Single title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist "
						+ "who Hails from owerri in Imo State drops her first Single title: Love Of God Produced by PH famous producer"
						+ " @donbazQueen Niella PH based Artist who Hails from owerri in Imo State drops her first Sin"
						+ "gle title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist who Hails from owerri in Imo State "
						+ "drops her first Single title: Love Of God Produced by PH famous producer @donbazQueen Niella PH based Artist "
						+ "who Hails from owerri in Imo State drops her first Single title: Love Of God Produced by PH famous producer"
						+ " @donbazQueen Niella PH based Artist who Hails from owerri in Imo State drops her first Sin"
						+ "gle title: Love Of God Produced by PH famous producer @donbaz");
		storybook[1] = new Story(
				"Photo: Mother of three caught with "
						+ "Cannbis at Lagos Airport",
				"A 37-year-old mother of three, Ezeh Ifeoma Maureen (pictured above), has been arrested "
						+ "with substances suspected to be cannabis by the National Drug Law Enforcement Agency (NDLEA)"
						+ " According to The Nation, Maureen was caught at the Murtala Mohammed International Airport (MMIA)"
						+ " in  Ikeja, Lagos, during outward screening of China-bound Ethiopian Airlines’ passengers for allegedly "
						+ "attempting to smuggle 6.200 kilogrammes of dried weeds that tested positive for cannabis.The agency’s Airport "
						+ "Commander, Mr. Hamza Umar, said the suspect told the officers that her bags contained vegetables and foodstuff. Continue...A 37-year-old mother of three, Ezeh Ifeoma Maureen (pictured above), has been arrested "
						+ "with substances suspected to be cannabis by the National Drug Law Enforcement Agency (NDLEA)"
						+ " According to The Nation, Maureen was caught at the Murtala Mohammed International Airport (MMIA)"
						+ " in  Ikeja, Lagos, during outward screening of China-bound Ethiopian Airlines’ passengers for allegedly "
						+ "attempting to smuggle 6.200 kilogrammes of dried weeds that tested positive for cannabis.The agency’s Airport "
						+ "Commander, Mr. Hamza Umar, said the suspect told the officers that her bags contained vegetables and foodstuff. Continue...A 37-year-old mother of three, Ezeh Ifeoma Maureen (pictured above), has been arrested "
						+ "with substances suspected to be cannabis by the National Drug Law Enforcement Agency (NDLEA)"
						+ " According to The Nation, Maureen was caught at the Murtala Mohammed International Airport (MMIA)"
						+ " in  Ikeja, Lagos, during outward screening of China-bound Ethiopian Airlines’ passengers for allegedly "
						+ "attempting to smuggle 6.200 kilogrammes of dried weeds that tested positive for cannabis.The agency’s Airport "
						+ "Commander, Mr. Hamza Umar, said the suspect told the officers that her bags contained vegetables and foodstuff. Continue...A 37-year-old mother of three, Ezeh Ifeoma Maureen (pictured above), has been arrested "
						+ "with substances suspected to be cannabis by the National Drug Law Enforcement Agency (NDLEA)"
						+ " According to The Nation, Maureen was caught at the Murtala Mohammed International Airport (MMIA)"
						+ " in  Ikeja, Lagos, during outward screening of China-bound Ethiopian Airlines’ passengers for allegedly "
						+ "attempting to smuggle 6.200 kilogrammes of dried weeds that tested positive for cannabis.The agency’s Airport "
						+ "Commander, Mr. Hamza Umar, said the suspect told the officers that her bags contained vegetables and foodstuff. Continue...A 37-year-old mother of three, Ezeh Ifeoma Maureen (pictured above), has been arrested "
						+ "with substances suspected to be cannabis by the National Drug Law Enforcement Agency (NDLEA)"
						+ " According to The Nation, Maureen was caught at the Murtala Mohammed International Airport (MMIA)"
						+ " in  Ikeja, Lagos, during outward screening of China-bound Ethiopian Airlines’ passengers for allegedly "
						+ "attempting to smuggle 6.200 kilogrammes of dried weeds that tested positive for cannabis.The agency’s Airport "
						+ "Commander, Mr. Hamza Umar, said the suspect told the officers that her bags contained vegetables and foodstuff. Continue...A 37-year-old mother of three, Ezeh Ifeoma Maureen (pictured above), has been arrested "
						+ "with substances suspected to be cannabis by the National Drug Law Enforcement Agency (NDLEA)"
						+ " According to The Nation, Maureen was caught at the Murtala Mohammed International Airport (MMIA)"
						+ " in  Ikeja, Lagos, during outward screening of China-bound Ethiopian Airlines’ passengers for allegedly "
						+ "attempting to smuggle 6.200 kilogrammes of dried weeds that tested positive for cannabis.The agency’s Airport "
						+ "Commander, Mr. Hamza Umar, said the suspect told the officers that her bags contained vegetables and foodstuff. Continue...A 37-year-old mother of three, Ezeh Ifeoma Maureen (pictured above), has been arrested "
						+ "with substances suspected to be cannabis by the National Drug Law Enforcement Agency (NDLEA)"
						+ " According to The Nation, Maureen was caught at the Murtala Mohammed International Airport (MMIA)"
						+ " in  Ikeja, Lagos, during outward screening of China-bound Ethiopian Airlines’ passengers for allegedly "
						+ "attempting to smuggle 6.200 kilogrammes of dried weeds that tested positive for cannabis.The agency’s Airport "
						+ "Commander, Mr. Hamza Umar, said the suspect told the officers that her bags contained vegetables and foodstuff. Continue...A 37-year-old mother of three, Ezeh Ifeoma Maureen (pictured above), has been arrested "
						+ "with substances suspected to be cannabis by the National Drug Law Enforcement Agency (NDLEA)"
						+ " According to The Nation, Maureen was caught at the Murtala Mohammed International Airport (MMIA)"
						+ " in  Ikeja, Lagos, during outward screening of China-bound Ethiopian Airlines’ passengers for allegedly "
						+ "attempting to smuggle 6.200 kilogrammes of dried weeds that tested positive for cannabis.The agency’s Airport "
						+ "Commander, Mr. Hamza Umar, said the suspect told the officers that her bags contained vegetables and foodstuff. Continue...A 37-year-old mother of three, Ezeh Ifeoma Maureen (pictured above), has been arrested "
						+ "with substances suspected to be cannabis by the National Drug Law Enforcement Agency (NDLEA)"
						+ " According to The Nation, Maureen was caught at the Murtala Mohammed International Airport (MMIA)"
						+ " in  Ikeja, Lagos, during outward screening of China-bound Ethiopian Airlines’ passengers for allegedly "
						+ "attempting to smuggle 6.200 kilogrammes of dried weeds that tested positive for cannabis.The agency’s Airport "
						+ "Commander, Mr. Hamza Umar, said the suspect told the officers that her bags contained vegetables and foodstuff. Continue...A 37-year-old mother of three, Ezeh Ifeoma Maureen (pictured above), has been arrested "
						+ "with substances suspected to be cannabis by the National Drug Law Enforcement Agency (NDLEA)"
						+ " According to The Nation, Maureen was caught at the Murtala Mohammed International Airport (MMIA)"
						+ " in  Ikeja, Lagos, during outward screening of China-bound Ethiopian Airlines’ passengers for allegedly "
						+ "attempting to smuggle 6.200 kilogrammes of dried weeds that tested positive for cannabis.The agency’s Airport "
						+ "Commander, Mr. Hamza Umar, said the suspect told the officers that her bags contained vegetables and foodstuff. Continue...A 37-year-old mother of three, Ezeh Ifeoma Maureen (pictured above), has been arrested "
						+ "with substances suspected to be cannabis by the National Drug Law Enforcement Agency (NDLEA)"
						+ " According to The Nation, Maureen was caught at the Murtala Mohammed International Airport (MMIA)"
						+ " in  Ikeja, Lagos, during outward screening of China-bound Ethiopian Airlines’ passengers for allegedly "
						+ "attempting to smuggle 6.200 kilogrammes of dried weeds that tested positive for cannabis.The agency’s Airport "
						+ "Commander, Mr. Hamza Umar, said the suspect told the officers that her bags contained vegetables and foodstuff. Continue...");
		storybook[2] = new Story(
				"Pics: Rapper Joe Budden accused of brutally beating his girlfriend",
				"According to MediaTakeOut, the New York and"
						+ " New Jersey Police is looking for rapper Joe Budden after he brutally beat his ex-girlfriend. Friends of the girl,"
						+ " whose identity is being hidden, sent pics of her bruised body to MTO and explained what led to the attack. See that"
						+ " below...Rapper Joe Budden got upset because (Joe's girlfriend)] dumped him after discovering he was cheating and"
						+ " hooking up with strippers. She then went out (clubbing) with a couple of friends to blow off some steam. One of her"
						+ " friends boyfriend uploaded pictures of [Joe's girlfriend] clubbing on Instagram and someone forward the pictures to "
						+ "Joe.Joe [must have] thought [Joe's girlfriend] was out clubbing and flirting with other men so he showed up Sunday "
						+ "morning, where she was out eating with friends (in Washington Heights) and told her to get in his car. When she "
						+ "entered his car he immediately bashed her head into the dashboard of the car and drove off with her to his houseAccording to MediaTakeOut, the New York and"
						+ " New Jersey Police is looking for rapper Joe Budden after he brutally beat his ex-girlfriend. Friends of the girl,"
						+ " whose identity is being hidden, sent pics of her bruised body to MTO and explained what led to the attack. See that"
						+ " below...Rapper Joe Budden got upset because (Joe's girlfriend)] dumped him after discovering he was cheating and"
						+ " hooking up with strippers. She then went out (clubbing) with a couple of friends to blow off some steam. One of her"
						+ " friends boyfriend uploaded pictures of [Joe's girlfriend] clubbing on Instagram and someone forward the pictures to "
						+ "Joe.Joe [must have] thought [Joe's girlfriend] was out clubbing and flirting with other men so he showed up Sunday "
						+ "morning, where she was out eating with friends (in Washington Heights) and told her to get in his car. When she "
						+ "entered his car he immediately bashed her head into the dashboard of the car and drove off with her to his houseAccording to MediaTakeOut, the New York and"
						+ " New Jersey Police is looking for rapper Joe Budden after he brutally beat his ex-girlfriend. Friends of the girl,"
						+ " whose identity is being hidden, sent pics of her bruised body to MTO and explained what led to the attack. See that"
						+ " below...Rapper Joe Budden got upset because (Joe's girlfriend)] dumped him after discovering he was cheating and"
						+ " hooking up with strippers. She then went out (clubbing) with a couple of friends to blow off some steam. One of her"
						+ " friends boyfriend uploaded pictures of [Joe's girlfriend] clubbing on Instagram and someone forward the pictures to "
						+ "Joe.Joe [must have] thought [Joe's girlfriend] was out clubbing and flirting with other men so he showed up Sunday "
						+ "morning, where she was out eating with friends (in Washington Heights) and told her to get in his car. When she "
						+ "entered his car he immediately bashed her head into the dashboard of the car and drove off with her to his houseAccording to MediaTakeOut, the New York and"
						+ " New Jersey Police is looking for rapper Joe Budden after he brutally beat his ex-girlfriend. Friends of the girl,"
						+ " whose identity is being hidden, sent pics of her bruised body to MTO and explained what led to the attack. See that"
						+ " below...Rapper Joe Budden got upset because (Joe's girlfriend)] dumped him after discovering he was cheating and"
						+ " hooking up with strippers. She then went out (clubbing) with a couple of friends to blow off some steam. One of her"
						+ " friends boyfriend uploaded pictures of [Joe's girlfriend] clubbing on Instagram and someone forward the pictures to "
						+ "Joe.Joe [must have] thought [Joe's girlfriend] was out clubbing and flirting with other men so he showed up Sunday "
						+ "morning, where she was out eating with friends (in Washington Heights) and told her to get in his car. When she "
						+ "entered his car he immediately bashed her head into the dashboard of the car and drove off with her to his houseAccording to MediaTakeOut, the New York and"
						+ " New Jersey Police is looking for rapper Joe Budden after he brutally beat his ex-girlfriend. Friends of the girl,"
						+ " whose identity is being hidden, sent pics of her bruised body to MTO and explained what led to the attack. See that"
						+ " below...Rapper Joe Budden got upset because (Joe's girlfriend)] dumped him after discovering he was cheating and"
						+ " hooking up with strippers. She then went out (clubbing) with a couple of friends to blow off some steam. One of her"
						+ " friends boyfriend uploaded pictures of [Joe's girlfriend] clubbing on Instagram and someone forward the pictures to "
						+ "Joe.Joe [must have] thought [Joe's girlfriend] was out clubbing and flirting with other men so he showed up Sunday "
						+ "morning, where she was out eating with friends (in Washington Heights) and told her to get in his car. When she "
						+ "entered his car he immediately bashed her head into the dashboard of the car and drove off with her to his houseAccording to MediaTakeOut, the New York and"
						+ " New Jersey Police is looking for rapper Joe Budden after he brutally beat his ex-girlfriend. Friends of the girl,"
						+ " whose identity is being hidden, sent pics of her bruised body to MTO and explained what led to the attack. See that"
						+ " below...Rapper Joe Budden got upset because (Joe's girlfriend)] dumped him after discovering he was cheating and"
						+ " hooking up with strippers. She then went out (clubbing) with a couple of friends to blow off some steam. One of her"
						+ " friends boyfriend uploaded pictures of [Joe's girlfriend] clubbing on Instagram and someone forward the pictures to "
						+ "Joe.Joe [must have] thought [Joe's girlfriend] was out clubbing and flirting with other men so he showed up Sunday "
						+ "morning, where she was out eating with friends (in Washington Heights) and told her to get in his car. When she "
						+ "entered his car he immediately bashed her head into the dashboard of the car and drove off with her to his houseAccording to MediaTakeOut, the New York and"
						+ " New Jersey Police is looking for rapper Joe Budden after he brutally beat his ex-girlfriend. Friends of the girl,"
						+ " whose identity is being hidden, sent pics of her bruised body to MTO and explained what led to the attack. See that"
						+ " below...Rapper Joe Budden got upset because (Joe's girlfriend)] dumped him after discovering he was cheating and"
						+ " hooking up with strippers. She then went out (clubbing) with a couple of friends to blow off some steam. One of her"
						+ " friends boyfriend uploaded pictures of [Joe's girlfriend] clubbing on Instagram and someone forward the pictures to "
						+ "Joe.Joe [must have] thought [Joe's girlfriend] was out clubbing and flirting with other men so he showed up Sunday "
						+ "morning, where she was out eating with friends (in Washington Heights) and told her to get in his car. When she "
						+ "entered his car he immediately bashed her head into the dashboard of the car and drove off with her to his houseAccording to MediaTakeOut, the New York and"
						+ " New Jersey Police is looking for rapper Joe Budden after he brutally beat his ex-girlfriend. Friends of the girl,"
						+ " whose identity is being hidden, sent pics of her bruised body to MTO and explained what led to the attack. See that"
						+ " below...Rapper Joe Budden got upset because (Joe's girlfriend)] dumped him after discovering he was cheating and"
						+ " hooking up with strippers. She then went out (clubbing) with a couple of friends to blow off some steam. One of her"
						+ " friends boyfriend uploaded pictures of [Joe's girlfriend] clubbing on Instagram and someone forward the pictures to "
						+ "Joe.Joe [must have] thought [Joe's girlfriend] was out clubbing and flirting with other men so he showed up Sunday "
						+ "morning, where she was out eating with friends (in Washington Heights) and told her to get in his car. When she "
						+ "entered his car he immediately bashed her head into the dashboard of the car and drove off with her to his houseAccording to MediaTakeOut, the New York and"
						+ " New Jersey Police is looking for rapper Joe Budden after he brutally beat his ex-girlfriend. Friends of the girl,"
						+ " whose identity is being hidden, sent pics of her bruised body to MTO and explained what led to the attack. See that"
						+ " below...Rapper Joe Budden got upset because (Joe's girlfriend)] dumped him after discovering he was cheating and"
						+ " hooking up with strippers. She then went out (clubbing) with a couple of friends to blow off some steam. One of her"
						+ " friends boyfriend uploaded pictures of [Joe's girlfriend] clubbing on Instagram and someone forward the pictures to "
						+ "Joe.Joe [must have] thought [Joe's girlfriend] was out clubbing and flirting with other men so he showed up Sunday "
						+ "morning, where she was out eating with friends (in Washington Heights) and told her to get in his car. When she "
						+ "entered his car he immediately bashed her head into the dashboard of the car and drove off with her to his house");
		storybook[3] = new Story(
				"Photos: New Enugu International Airport flooded",
				"I've been getting these images all day. Supposedly"
						+ " this is what the new Akanu Ibiam International Airport in Enugu state looked like this morning after it rained. "
						+ "Is this for real, for real?. Continue..I've been getting these images all day. Supposedly this is what the new Akanu"
						+ " Ibiam International Airport in Enugu state looked like this morning after it rained. Is this for real, for real?"
						+ ". Continue..  I've been getting these images all day. Supposedly this is what the new Akanu Ibiam International Airport"
						+ " in Enugu state looked like this morning after it rained. Is this for real, for real?. Continue..I've been getting these images all day. Supposedly"
						+ " this is what the new Akanu Ibiam International Airport in Enugu state looked like this morning after it rained. "
						+ "Is this for real, for real?. Continue..I've been getting these images all day. Supposedly this is what the new Akanu"
						+ " Ibiam International Airport in Enugu state looked like this morning after it rained. Is this for real, for real?"
						+ ". Continue..  I've been getting these images all day. Supposedly this is what the new Akanu Ibiam International Airport"
						+ " in Enugu state looked like this morning after it rained. Is this for real, for real?. Continue..I've been getting these images all day. Supposedly"
						+ " this is what the new Akanu Ibiam International Airport in Enugu state looked like this morning after it rained. "
						+ "Is this for real, for real?. Continue..I've been getting these images all day. Supposedly this is what the new Akanu"
						+ " Ibiam International Airport in Enugu state looked like this morning after it rained. Is this for real, for real?"
						+ ". Continue..  I've been getting these images all day. Supposedly this is what the new Akanu Ibiam International Airport"
						+ " in Enugu state looked like this morning after it rained. Is this for real, for real?. Continue..I've been getting these images all day. Supposedly"
						+ " this is what the new Akanu Ibiam International Airport in Enugu state looked like this morning after it rained. "
						+ "Is this for real, for real?. Continue..I've been getting these images all day. Supposedly this is what the new Akanu"
						+ " Ibiam International Airport in Enugu state looked like this morning after it rained. Is this for real, for real?"
						+ ". Continue..  I've been getting these images all day. Supposedly this is what the new Akanu Ibiam International Airport"
						+ " in Enugu state looked like this morning after it rained. Is this for real, for real?. Continue..I've been getting these images all day. Supposedly"
						+ " this is what the new Akanu Ibiam International Airport in Enugu state looked like this morning after it rained. "
						+ "Is this for real, for real?. Continue..I've been getting these images all day. Supposedly this is what the new Akanu"
						+ " Ibiam International Airport in Enugu state looked like this morning after it rained. Is this for real, for real?"
						+ ". Continue..  I've been getting these images all day. Supposedly this is what the new Akanu Ibiam International Airport"
						+ " in Enugu state looked like this morning after it rained. Is this for real, for real?. Continue..I've been getting these images all day. Supposedly"
						+ " this is what the new Akanu Ibiam International Airport in Enugu state looked like this morning after it rained. "
						+ "Is this for real, for real?. Continue..I've been getting these images all day. Supposedly this is what the new Akanu"
						+ " Ibiam International Airport in Enugu state looked like this morning after it rained. Is this for real, for real?"
						+ ". Continue..  I've been getting these images all day. Supposedly this is what the new Akanu Ibiam International Airport"
						+ " in Enugu state looked like this morning after it rained. Is this for real, for real?. Continue..I've been getting these images all day. Supposedly"
						+ " this is what the new Akanu Ibiam International Airport in Enugu state looked like this morning after it rained. "
						+ "Is this for real, for real?. Continue..I've been getting these images all day. Supposedly this is what the new Akanu"
						+ " Ibiam International Airport in Enugu state looked like this morning after it rained. Is this for real, for real?"
						+ ". Continue..  I've been getting these images all day. Supposedly this is what the new Akanu Ibiam International Airport"
						+ " in Enugu state looked like this morning after it rained. Is this for real, for real?. Continue..I've been getting these images all day. Supposedly"
						+ " this is what the new Akanu Ibiam International Airport in Enugu state looked like this morning after it rained. "
						+ "Is this for real, for real?. Continue..I've been getting these images all day. Supposedly this is what the new Akanu"
						+ " Ibiam International Airport in Enugu state looked like this morning after it rained. Is this for real, for real?"
						+ ". Continue..  I've been getting these images all day. Supposedly this is what the new Akanu Ibiam International Airport"
						+ " in Enugu state looked like this morning after it rained. Is this for real, for real?. Continue..I've been getting these images all day. Supposedly"
						+ " this is what the new Akanu Ibiam International Airport in Enugu state looked like this morning after it rained. "
						+ "Is this for real, for real?. Continue..I've been getting these images all day. Supposedly this is what the new Akanu"
						+ " Ibiam International Airport in Enugu state looked like this morning after it rained. Is this for real, for real?"
						+ ". Continue..  I've been getting these images all day. Supposedly this is what the new Akanu Ibiam International Airport"
						+ " in Enugu state looked like this morning after it rained. Is this for real, for real?. Continue..I've been getting these images all day. Supposedly"
						+ " this is what the new Akanu Ibiam International Airport in Enugu state looked like this morning after it rained. "
						+ "Is this for real, for real?. Continue..I've been getting these images all day. Supposedly this is what the new Akanu"
						+ " Ibiam International Airport in Enugu state looked like this morning after it rained. Is this for real, for real?"
						+ ". Continue..  I've been getting these images all day. Supposedly this is what the new Akanu Ibiam International Airport"
						+ " in Enugu state looked like this morning after it rained. Is this for real, for real?. Continue..I've been getting these images all day. Supposedly"
						+ " this is what the new Akanu Ibiam International Airport in Enugu state looked like this morning after it rained. "
						+ "Is this for real, for real?. Continue..I've been getting these images all day. Supposedly this is what the new Akanu"
						+ " Ibiam International Airport in Enugu state looked like this morning after it rained. Is this for real, for real?"
						+ ". Continue..  I've been getting these images all day. Supposedly this is what the new Akanu Ibiam International Airport"
						+ " in Enugu state looked like this morning after it rained. Is this for real, for real?. Continue..I've been getting these images all day. Supposedly"
						+ " this is what the new Akanu Ibiam International Airport in Enugu state looked like this morning after it rained. "
						+ "Is this for real, for real?. Continue..I've been getting these images all day. Supposedly this is what the new Akanu"
						+ " Ibiam International Airport in Enugu state looked like this morning after it rained. Is this for real, for real?"
						+ ". Continue..  I've been getting these images all day. Supposedly this is what the new Akanu Ibiam International Airport"
						+ " in Enugu state looked like this morning after it rained. Is this for real, for real?. Continue..");
		storybook[4] = new Story(
				"EFCC Arrests two bankers for N9million fraud",
				"Find the EFCC press release below Two bankers,"
						+ " Rowland Alozie, Segun Osho and their accomplice, Abass Kolawole have been arrested by operatives of the Economic"
						+ " and Financial Crimes Commission, EFCC for alleged conspiracy and fraudulent conversion of Rivers State Board of"
						+ " Internal Revenue Cheque for nine million, five hundred and fifty-four thousand, two hundred and eighty six naira, "
						+ "(N9554,286, 00). Continue...Find the EFCC press release below Two bankers,"
						+ " Rowland Alozie, Segun Osho and their accomplice, Abass Kolawole have been arrested by operatives of the Economic"
						+ " and Financial Crimes Commission, EFCC for alleged conspiracy and fraudulent conversion of Rivers State Board of"
						+ " Internal Revenue Cheque for nine million, five hundred and fifty-four thousand, two hundred and eighty six naira, "
						+ "(N9554,286, 00). Continue...Find the EFCC press release below Two bankers,"
						+ " Rowland Alozie, Segun Osho and their accomplice, Abass Kolawole have been arrested by operatives of the Economic"
						+ " and Financial Crimes Commission, EFCC for alleged conspiracy and fraudulent conversion of Rivers State Board of"
						+ " Internal Revenue Cheque for nine million, five hundred and fifty-four thousand, two hundred and eighty six naira, "
						+ "(N9554,286, 00). Continue...Find the EFCC press release below Two bankers,"
						+ " Rowland Alozie, Segun Osho and their accomplice, Abass Kolawole have been arrested by operatives of the Economic"
						+ " and Financial Crimes Commission, EFCC for alleged conspiracy and fraudulent conversion of Rivers State Board of"
						+ " Internal Revenue Cheque for nine million, five hundred and fifty-four thousand, two hundred and eighty six naira, "
						+ "(N9554,286, 00). Continue...Find the EFCC press release below Two bankers,"
						+ " Rowland Alozie, Segun Osho and their accomplice, Abass Kolawole have been arrested by operatives of the Economic"
						+ " and Financial Crimes Commission, EFCC for alleged conspiracy and fraudulent conversion of Rivers State Board of"
						+ " Internal Revenue Cheque for nine million, five hundred and fifty-four thousand, two hundred and eighty six naira, "
						+ "(N9554,286, 00). Continue...Find the EFCC press release below Two bankers,"
						+ " Rowland Alozie, Segun Osho and their accomplice, Abass Kolawole have been arrested by operatives of the Economic"
						+ " and Financial Crimes Commission, EFCC for alleged conspiracy and fraudulent conversion of Rivers State Board of"
						+ " Internal Revenue Cheque for nine million, five hundred and fifty-four thousand, two hundred and eighty six naira, "
						+ "(N9554,286, 00). Continue...Find the EFCC press release below Two bankers,"
						+ " Rowland Alozie, Segun Osho and their accomplice, Abass Kolawole have been arrested by operatives of the Economic"
						+ " and Financial Crimes Commission, EFCC for alleged conspiracy and fraudulent conversion of Rivers State Board of"
						+ " Internal Revenue Cheque for nine million, five hundred and fifty-four thousand, two hundred and eighty six naira, "
						+ "(N9554,286, 00). Continue...Find the EFCC press release below Two bankers,"
						+ " Rowland Alozie, Segun Osho and their accomplice, Abass Kolawole have been arrested by operatives of the Economic"
						+ " and Financial Crimes Commission, EFCC for alleged conspiracy and fraudulent conversion of Rivers State Board of"
						+ " Internal Revenue Cheque for nine million, five hundred and fifty-four thousand, two hundred and eighty six naira, "
						+ "(N9554,286, 00). Continue...Find the EFCC press release below Two bankers,"
						+ " Rowland Alozie, Segun Osho and their accomplice, Abass Kolawole have been arrested by operatives of the Economic"
						+ " and Financial Crimes Commission, EFCC for alleged conspiracy and fraudulent conversion of Rivers State Board of"
						+ " Internal Revenue Cheque for nine million, five hundred and fifty-four thousand, two hundred and eighty six naira, "
						+ "(N9554,286, 00). Continue...Find the EFCC press release below Two bankers,"
						+ " Rowland Alozie, Segun Osho and their accomplice, Abass Kolawole have been arrested by operatives of the Economic"
						+ " and Financial Crimes Commission, EFCC for alleged conspiracy and fraudulent conversion of Rivers State Board of"
						+ " Internal Revenue Cheque for nine million, five hundred and fifty-four thousand, two hundred and eighty six naira, "
						+ "(N9554,286, 00). Continue...Find the EFCC press release below Two bankers,"
						+ " Rowland Alozie, Segun Osho and their accomplice, Abass Kolawole have been arrested by operatives of the Economic"
						+ " and Financial Crimes Commission, EFCC for alleged conspiracy and fraudulent conversion of Rivers State Board of"
						+ " Internal Revenue Cheque for nine million, five hundred and fifty-four thousand, two hundred and eighty six naira, "
						+ "(N9554,286, 00). Continue...Find the EFCC press release below Two bankers,"
						+ " Rowland Alozie, Segun Osho and their accomplice, Abass Kolawole have been arrested by operatives of the Economic"
						+ " and Financial Crimes Commission, EFCC for alleged conspiracy and fraudulent conversion of Rivers State Board of"
						+ " Internal Revenue Cheque for nine million, five hundred and fifty-four thousand, two hundred and eighty six naira, "
						+ "(N9554,286, 00). Continue...");
		storybook[5] = new Story("Orijin: 4 parties, 3 Cities. Orezi, Timaya, Kcee hit Warri, Asaba and Enugu", "Orijin, the modern African drink" +
				" started its National campaign launch in Benin with Orezi on hand to thrill the audience. From there, it was on to Onitsha and" +
				" Port-Harcourt where the brand gave a double dose of fun with Phyno and Burna who performed simultaneously to the delight of party " +
				"goers and consumers of Orijin. Asaba Warri and Enugu are next in line to experience a rare night this Friday, 22nd of August, 2014.This " +
				"time round, DJ Sose, DJ Humility and DJ Spinall and DJ Neptune will be throwing down in typical fashion in Warri, Asaba and Enugu " +
				"respectively. Another Orijinal night hits Nigeria. ContinueOrijin, the modern African drink" +
				" started its National campaign launch in Benin with Orezi on hand to thrill the audience. From there, it was on to Onitsha and" +
				" Port-Harcourt where the brand gave a double dose of fun with Phyno and Burna who performed simultaneously to the delight of party " +
				"goers and consumers of Orijin. Asaba Warri and Enugu are next in line to experience a rare night this Friday, 22nd of August, 2014.This " +
				"time round, DJ Sose, DJ Humility and DJ Spinall and DJ Neptune will be throwing down in typical fashion in Warri, Asaba and Enugu " +
				"respectively. Another Orijinal night hits Nigeria. ContinueOrijin, the modern African drink" +
				" started its National campaign launch in Benin with Orezi on hand to thrill the audience. From there, it was on to Onitsha and" +
				" Port-Harcourt where the brand gave a double dose of fun with Phyno and Burna who performed simultaneously to the delight of party " +
				"goers and consumers of Orijin. Asaba Warri and Enugu are next in line to experience a rare night this Friday, 22nd of August, 2014.This " +
				"time round, DJ Sose, DJ Humility and DJ Spinall and DJ Neptune will be throwing down in typical fashion in Warri, Asaba and Enugu " +
				"respectively. Another Orijinal night hits Nigeria. ContinueOrijin, the modern African drink" +
				" started its National campaign launch in Benin with Orezi on hand to thrill the audience. From there, it was on to Onitsha and" +
				" Port-Harcourt where the brand gave a double dose of fun with Phyno and Burna who performed simultaneously to the delight of party " +
				"goers and consumers of Orijin. Asaba Warri and Enugu are next in line to experience a rare night this Friday, 22nd of August, 2014.This " +
				"time round, DJ Sose, DJ Humility and DJ Spinall and DJ Neptune will be throwing down in typical fashion in Warri, Asaba and Enugu " +
				"respectively. Another Orijinal night hits Nigeria. ContinueOrijin, the modern African drink" +
				" started its National campaign launch in Benin with Orezi on hand to thrill the audience. From there, it was on to Onitsha and" +
				" Port-Harcourt where the brand gave a double dose of fun with Phyno and Burna who performed simultaneously to the delight of party " +
				"goers and consumers of Orijin. Asaba Warri and Enugu are next in line to experience a rare night this Friday, 22nd of August, 2014.This " +
				"time round, DJ Sose, DJ Humility and DJ Spinall and DJ Neptune will be throwing down in typical fashion in Warri, Asaba and Enugu " +
				"respectively. Another Orijinal night hits Nigeria. ContinueOrijin, the modern African drink" +
				" started its National campaign launch in Benin with Orezi on hand to thrill the audience. From there, it was on to Onitsha and" +
				" Port-Harcourt where the brand gave a double dose of fun with Phyno and Burna who performed simultaneously to the delight of party " +
				"goers and consumers of Orijin. Asaba Warri and Enugu are next in line to experience a rare night this Friday, 22nd of August, 2014.This " +
				"time round, DJ Sose, DJ Humility and DJ Spinall and DJ Neptune will be throwing down in typical fashion in Warri, Asaba and Enugu " +
				"respectively. Another Orijinal night hits Nigeria. ContinueOrijin, the modern African drink" +
				" started its National campaign launch in Benin with Orezi on hand to thrill the audience. From there, it was on to Onitsha and" +
				" Port-Harcourt where the brand gave a double dose of fun with Phyno and Burna who performed simultaneously to the delight of party " +
				"goers and consumers of Orijin. Asaba Warri and Enugu are next in line to experience a rare night this Friday, 22nd of August, 2014.This " +
				"time round, DJ Sose, DJ Humility and DJ Spinall and DJ Neptune will be throwing down in typical fashion in Warri, Asaba and Enugu " +
				"respectively. Another Orijinal night hits Nigeria. ContinueOrijin, the modern African drink" +
				" started its National campaign launch in Benin with Orezi on hand to thrill the audience. From there, it was on to Onitsha and" +
				" Port-Harcourt where the brand gave a double dose of fun with Phyno and Burna who performed simultaneously to the delight of party " +
				"goers and consumers of Orijin. Asaba Warri and Enugu are next in line to experience a rare night this Friday, 22nd of August, 2014.This " +
				"time round, DJ Sose, DJ Humility and DJ Spinall and DJ Neptune will be throwing down in typical fashion in Warri, Asaba and Enugu " +
				"respectively. Another Orijinal night hits Nigeria. Continue");
		storybook[6] = new Story("IN PURSUIT OF HAPPINESS ", "Nnenna struggled until she was able to standup and then headed straight for the palace, " +
				"she couldn’t let anyone know of her predicament for she was scared to loose favour before Igwe Achebe for the instruction he gave out was " +
				"strict as she cleaned herself of blood stains, laid in her mat thinking of the next line of action to take, “I need to give Igwe Achebe a son" +
				" at all cost” so she thought and then inevitable claws of sleep pounced on her being and she slept off.Ifeoma began to give signs " +
				"of early pregnancy the next morning, she was matured to know if she is pregnant or not as she ran into the palace of the Igwe, " +
				"Igwe who was pouring libation to the gods, a ritual he has not done in years but since the turn out of events, he was not only " +
				"pleased with himself but with the gods also as he rained praises on the gods while Ifeoma waited patiently, shaking in great " +
				"anticipation for she couldn’t wait to break the news to the as she shouted IFEOMA: Dim o! Igwe Achebe am pregnant o! the gods are" +
				" really on our side this harvesting season!Igwe Achebe paused, turned and looked at IfeomaNnenna struggled until she was able to standup and then headed straight for the palace, " +
				"she couldn’t let anyone know of her predicament for she was scared to loose favour before Igwe Achebe for the instruction he gave out was " +
				"strict as she cleaned herself of blood stains, laid in her mat thinking of the next line of action to take, “I need to give Igwe Achebe a son" +
				" at all cost” so she thought and then inevitable claws of sleep pounced on her being and she slept off.Ifeoma began to give signs " +
				"of early pregnancy the next morning, she was matured to know if she is pregnant or not as she ran into the palace of the Igwe, " +
				"Igwe who was pouring libation to the gods, a ritual he has not done in years but since the turn out of events, he was not only " +
				"pleased with himself but with the gods also as he rained praises on the gods while Ifeoma waited patiently, shaking in great " +
				"anticipation for she couldn’t wait to break the news to the as she shouted IFEOMA: Dim o! Igwe Achebe am pregnant o! the gods are" +
				" really on our side this harvesting season!Igwe Achebe paused, turned and looked at IfeomaNnenna struggled until she was able to standup and then headed straight for the palace, " +
				"she couldn’t let anyone know of her predicament for she was scared to loose favour before Igwe Achebe for the instruction he gave out was " +
				"strict as she cleaned herself of blood stains, laid in her mat thinking of the next line of action to take, “I need to give Igwe Achebe a son" +
				" at all cost” so she thought and then inevitable claws of sleep pounced on her being and she slept off.Ifeoma began to give signs " +
				"of early pregnancy the next morning, she was matured to know if she is pregnant or not as she ran into the palace of the Igwe, " +
				"Igwe who was pouring libation to the gods, a ritual he has not done in years but since the turn out of events, he was not only " +
				"pleased with himself but with the gods also as he rained praises on the gods while Ifeoma waited patiently, shaking in great " +
				"anticipation for she couldn’t wait to break the news to the as she shouted IFEOMA: Dim o! Igwe Achebe am pregnant o! the gods are" +
				" really on our side this harvesting season!Igwe Achebe paused, turned and looked at IfeomaNnenna struggled until she was able to standup and then headed straight for the palace, " +
				"she couldn’t let anyone know of her predicament for she was scared to loose favour before Igwe Achebe for the instruction he gave out was " +
				"strict as she cleaned herself of blood stains, laid in her mat thinking of the next line of action to take, “I need to give Igwe Achebe a son" +
				" at all cost” so she thought and then inevitable claws of sleep pounced on her being and she slept off.Ifeoma began to give signs " +
				"of early pregnancy the next morning, she was matured to know if she is pregnant or not as she ran into the palace of the Igwe, " +
				"Igwe who was pouring libation to the gods, a ritual he has not done in years but since the turn out of events, he was not only " +
				"pleased with himself but with the gods also as he rained praises on the gods while Ifeoma waited patiently, shaking in great " +
				"anticipation for she couldn’t wait to break the news to the as she shouted IFEOMA: Dim o! Igwe Achebe am pregnant o! the gods are" +
				" really on our side this harvesting season!Igwe Achebe paused, turned and looked at IfeomaNnenna struggled until she was able to standup and then headed straight for the palace, " +
				"she couldn’t let anyone know of her predicament for she was scared to loose favour before Igwe Achebe for the instruction he gave out was " +
				"strict as she cleaned herself of blood stains, laid in her mat thinking of the next line of action to take, “I need to give Igwe Achebe a son" +
				" at all cost” so she thought and then inevitable claws of sleep pounced on her being and she slept off.Ifeoma began to give signs " +
				"of early pregnancy the next morning, she was matured to know if she is pregnant or not as she ran into the palace of the Igwe, " +
				"Igwe who was pouring libation to the gods, a ritual he has not done in years but since the turn out of events, he was not only " +
				"pleased with himself but with the gods also as he rained praises on the gods while Ifeoma waited patiently, shaking in great " +
				"anticipation for she couldn’t wait to break the news to the as she shouted IFEOMA: Dim o! Igwe Achebe am pregnant o! the gods are" +
				" really on our side this harvesting season!Igwe Achebe paused, turned and looked at IfeomaNnenna struggled until she was able to standup and then headed straight for the palace, " +
				"she couldn’t let anyone know of her predicament for she was scared to loose favour before Igwe Achebe for the instruction he gave out was " +
				"strict as she cleaned herself of blood stains, laid in her mat thinking of the next line of action to take, “I need to give Igwe Achebe a son" +
				" at all cost” so she thought and then inevitable claws of sleep pounced on her being and she slept off.Ifeoma began to give signs " +
				"of early pregnancy the next morning, she was matured to know if she is pregnant or not as she ran into the palace of the Igwe, " +
				"Igwe who was pouring libation to the gods, a ritual he has not done in years but since the turn out of events, he was not only " +
				"pleased with himself but with the gods also as he rained praises on the gods while Ifeoma waited patiently, shaking in great " +
				"anticipation for she couldn’t wait to break the news to the as she shouted IFEOMA: Dim o! Igwe Achebe am pregnant o! the gods are" +
				" really on our side this harvesting season!Igwe Achebe paused, turned and looked at IfeomaNnenna struggled until she was able to standup and then headed straight for the palace, " +
				"she couldn’t let anyone know of her predicament for she was scared to loose favour before Igwe Achebe for the instruction he gave out was " +
				"strict as she cleaned herself of blood stains, laid in her mat thinking of the next line of action to take, “I need to give Igwe Achebe a son" +
				" at all cost” so she thought and then inevitable claws of sleep pounced on her being and she slept off.Ifeoma began to give signs " +
				"of early pregnancy the next morning, she was matured to know if she is pregnant or not as she ran into the palace of the Igwe, " +
				"Igwe who was pouring libation to the gods, a ritual he has not done in years but since the turn out of events, he was not only " +
				"pleased with himself but with the gods also as he rained praises on the gods while Ifeoma waited patiently, shaking in great " +
				"anticipation for she couldn’t wait to break the news to the as she shouted IFEOMA: Dim o! Igwe Achebe am pregnant o! the gods are" +
				" really on our side this harvesting season!Igwe Achebe paused, turned and looked at IfeomaNnenna struggled until she was able to standup and then headed straight for the palace, " +
				"she couldn’t let anyone know of her predicament for she was scared to loose favour before Igwe Achebe for the instruction he gave out was " +
				"strict as she cleaned herself of blood stains, laid in her mat thinking of the next line of action to take, “I need to give Igwe Achebe a son" +
				" at all cost” so she thought and then inevitable claws of sleep pounced on her being and she slept off.Ifeoma began to give signs " +
				"of early pregnancy the next morning, she was matured to know if she is pregnant or not as she ran into the palace of the Igwe, " +
				"Igwe who was pouring libation to the gods, a ritual he has not done in years but since the turn out of events, he was not only " +
				"pleased with himself but with the gods also as he rained praises on the gods while Ifeoma waited patiently, shaking in great " +
				"anticipation for she couldn’t wait to break the news to the as she shouted IFEOMA: Dim o! Igwe Achebe am pregnant o! the gods are" +
				" really on our side this harvesting season!Igwe Achebe paused, turned and looked at Ifeoma");
		storybook[7] = new Story("Kent Brantly US doctor who survived Ebola speaks, leaves hospital", "Dr. Kent Brantly, the US doctor cured" +
				" of Ebola left the Emory University Hospital Atlanta about an hour ago. Before leaving, he spoke at a news conference, telling " +
				"reporters that he's thrilled to be alive Today is a miraculous day. I’m thrilled to be alive, to be well and to be reunited with my " +
				"family. I cannot thank you enough for your prayers and your support, but what I can tell you is that I serve a God who answers prayers." +
				" God saved my life, a direct answer to thousands and thousands of prayers. Thank you to the Liberia comunity, Emory hospital and so many" +
				" of you, my family, friends and church family. Please don’t stop praying for others in West Africa.I will be going away to recover physically" +
				" and emotionally, but for now, we need some time together in private before sharing more of our journey. He said The other American " +
				"missionary Nancy Writebol was discharged from Emory University Hospital on Tuesday August 19th totally cured of Ebola. Watch Dr Brantly's" +
				" speech for the cut...Dr. Kent Brantly, the US doctor cured" +
				" of Ebola left the Emory University Hospital Atlanta about an hour ago. Before leaving, he spoke at a news conference, telling " +
				"reporters that he's thrilled to be alive Today is a miraculous day. I’m thrilled to be alive, to be well and to be reunited with my " +
				"family. I cannot thank you enough for your prayers and your support, but what I can tell you is that I serve a God who answers prayers." +
				" God saved my life, a direct answer to thousands and thousands of prayers. Thank you to the Liberia comunity, Emory hospital and so many" +
				" of you, my family, friends and church family. Please don’t stop praying for others in West Africa.I will be going away to recover physically" +
				" and emotionally, but for now, we need some time together in private before sharing more of our journey. He said The other American " +
				"missionary Nancy Writebol was discharged from Emory University Hospital on Tuesday August 19th totally cured of Ebola. Watch Dr Brantly's" +
				" speech for the cut...Dr. Kent Brantly, the US doctor cured" +
				" of Ebola left the Emory University Hospital Atlanta about an hour ago. Before leaving, he spoke at a news conference, telling " +
				"reporters that he's thrilled to be alive Today is a miraculous day. I’m thrilled to be alive, to be well and to be reunited with my " +
				"family. I cannot thank you enough for your prayers and your support, but what I can tell you is that I serve a God who answers prayers." +
				" God saved my life, a direct answer to thousands and thousands of prayers. Thank you to the Liberia comunity, Emory hospital and so many" +
				" of you, my family, friends and church family. Please don’t stop praying for others in West Africa.I will be going away to recover physically" +
				" and emotionally, but for now, we need some time together in private before sharing more of our journey. He said The other American " +
				"missionary Nancy Writebol was discharged from Emory University Hospital on Tuesday August 19th totally cured of Ebola. Watch Dr Brantly's" +
				" speech for the cut...Dr. Kent Brantly, the US doctor cured" +
				" of Ebola left the Emory University Hospital Atlanta about an hour ago. Before leaving, he spoke at a news conference, telling " +
				"reporters that he's thrilled to be alive Today is a miraculous day. I’m thrilled to be alive, to be well and to be reunited with my " +
				"family. I cannot thank you enough for your prayers and your support, but what I can tell you is that I serve a God who answers prayers." +
				" God saved my life, a direct answer to thousands and thousands of prayers. Thank you to the Liberia comunity, Emory hospital and so many" +
				" of you, my family, friends and church family. Please don’t stop praying for others in West Africa.I will be going away to recover physically" +
				" and emotionally, but for now, we need some time together in private before sharing more of our journey. He said The other American " +
				"missionary Nancy Writebol was discharged from Emory University Hospital on Tuesday August 19th totally cured of Ebola. Watch Dr Brantly's" +
				" speech for the cut...Dr. Kent Brantly, the US doctor cured" +
				" of Ebola left the Emory University Hospital Atlanta about an hour ago. Before leaving, he spoke at a news conference, telling " +
				"reporters that he's thrilled to be alive Today is a miraculous day. I’m thrilled to be alive, to be well and to be reunited with my " +
				"family. I cannot thank you enough for your prayers and your support, but what I can tell you is that I serve a God who answers prayers." +
				" God saved my life, a direct answer to thousands and thousands of prayers. Thank you to the Liberia comunity, Emory hospital and so many" +
				" of you, my family, friends and church family. Please don’t stop praying for others in West Africa.I will be going away to recover physically" +
				" and emotionally, but for now, we need some time together in private before sharing more of our journey. He said The other American " +
				"missionary Nancy Writebol was discharged from Emory University Hospital on Tuesday August 19th totally cured of Ebola. Watch Dr Brantly's" +
				" speech for the cut...");
		storybook[8] = new Story("Boko Haram takes over Police Academy in Borno state", "Boko Haram men today August 21st reportedly invaded the Liman" +
				" Kara Police college, a riot police training academy in Gwoza, Borno state and took over the academy.according to BBC, the sect men" +
				" arrived the town in armored cars and dozens of motorcycles. Scores of trainees at the academy have been reported killed while many " +
				"managed to escape to nearby mountains for safety. More details laterBoko Haram men today August 21st reportedly invaded the Liman Kara Police" +
				" college, a riot police training academy in Gwoza, Borno state and took over the academy. According to BBC, the sect men arrived the town in" +
				" armored cars and dozens of motorcycles. Scores of trainees at the academy have been reported killed while many managed to escape to nearby" +
				" mountains for safety. More details laterBoko Haram men today August 21st reportedly invaded the Liman Kara Police college, a riot police training" +
				" academy in Gwoza, Borno state and took over the academy. According to BBC, the sect men arrived the town in armored cars and dozens " +
				"of motorcycles. Scores of trainees at the academy have been reported killed while many managed to escape to nearby mountains for safety." +
				" More details later Boko Haram men today August 21st reportedly invaded the Liman" +
				" Kara Police college, a riot police training academy in Gwoza, Borno state and took over the academy.according to BBC, the sect men" +
				" arrived the town in armored cars and dozens of motorcycles. Scores of trainees at the academy have been reported killed while many " +
				"managed to escape to nearby mountains for safety. More details laterBoko Haram men today August 21st reportedly invaded the Liman Kara Police" +
				" college, a riot police training academy in Gwoza, Borno state and took over the academy. According to BBC, the sect men arrived the town in" +
				" armored cars and dozens of motorcycles. Scores of trainees at the academy have been reported killed while many managed to escape to nearby" +
				" mountains for safety. More details laterBoko Haram men today August 21st reportedly invaded the Liman Kara Police college, a riot police training" +
				" academy in Gwoza, Borno state and took over the academy. According to BBC, the sect men arrived the town in armored cars and dozens " +
				"of motorcycles. Scores of trainees at the academy have been reported killed while many managed to escape to nearby mountains for safety." +
				" More details laterBoko Haram men today August 21st reportedly invaded the Liman" +
				" Kara Police college, a riot police training academy in Gwoza, Borno state and took over the academy.according to BBC, the sect men" +
				" arrived the town in armored cars and dozens of motorcycles. Scores of trainees at the academy have been reported killed while many " +
				"managed to escape to nearby mountains for safety. More details laterBoko Haram men today August 21st reportedly invaded the Liman Kara Police" +
				" college, a riot police training academy in Gwoza, Borno state and took over the academy. According to BBC, the sect men arrived the town in" +
				" armored cars and dozens of motorcycles. Scores of trainees at the academy have been reported killed while many managed to escape to nearby" +
				" mountains for safety. More details laterBoko Haram men today August 21st reportedly invaded the Liman Kara Police college, a riot police training" +
				" academy in Gwoza, Borno state and took over the academy. According to BBC, the sect men arrived the town in armored cars and dozens " +
				"of motorcycles. Scores of trainees at the academy have been reported killed while many managed to escape to nearby mountains for safety." +
				" More details laterBoko Haram men today August 21st reportedly invaded the Liman" +
				" Kara Police college, a riot police training academy in Gwoza, Borno state and took over the academy.according to BBC, the sect men" +
				" arrived the town in armored cars and dozens of motorcycles. Scores of trainees at the academy have been reported killed while many " +
				"managed to escape to nearby mountains for safety. More details laterBoko Haram men today August 21st reportedly invaded the Liman Kara Police" +
				" college, a riot police training academy in Gwoza, Borno state and took over the academy. According to BBC, the sect men arrived the town in" +
				" armored cars and dozens of motorcycles. Scores of trainees at the academy have been reported killed while many managed to escape to nearby" +
				" mountains for safety. More details laterBoko Haram men today August 21st reportedly invaded the Liman Kara Police college, a riot police training" +
				" academy in Gwoza, Borno state and took over the academy. According to BBC, the sect men arrived the town in armored cars and dozens " +
				"of motorcycles. Scores of trainees at the academy have been reported killed while many managed to escape to nearby mountains for safety." +
				" More details later");
		title.setText(storybook[0].title);
		body.setText(storybook[0].body);
		btn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Random rand = new Random();

				int i = rand.nextInt(8) + 0;
				
				
				// 50 is the maximum and the 1 is our minimum
				title.setText(storybook[i].title);
				body.setText(storybook[i].body);
				
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public class Story {
		protected String title;
		protected String body;

		public Story(String title, String body) {
			this.body = body;
			this.title = title;
		}
	}

}
