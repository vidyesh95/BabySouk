package com.bcod.babysouk.ui.account.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.bcod.babysouk.R;
import com.bcod.babysouk.adapter.CountryAdapter;
import com.bcod.babysouk.adapter.LanguageAdapter;
import com.bcod.babysouk.databinding.SettingsFragmentBinding;
import com.bcod.babysouk.model.CountryItem;
import com.bcod.babysouk.model.LanguageItem;

import java.util.ArrayList;
import java.util.Objects;

public class SettingsFragment extends Fragment {

    private SettingsFragmentBinding binding;
    private SettingsViewModel mSettingsViewModel;
    private ArrayList<CountryItem> mCountryArrayList;
    private ArrayList<LanguageItem> mLanguageArrayList;

    public static SettingsFragment newInstance() {
        return new SettingsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = SettingsFragmentBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        initCountryList();
        initLanguageList();
        // TODO Contructor context
        /*CountryAdapter mRegionAdapter = new CountryAdapter(this,
                mCountryArrayList);
        binding.countryDropDownMenu.setAdapter(mRegionAdapter);
        LanguageAdapter mAdapter = new LanguageAdapter(this, mLanguageArrayList);
        binding.languageDropDownMenu.setAdapter(mAdapter);*/
        binding.languageDropDownMenu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                LanguageItem clickedItem = (LanguageItem) parent.getItemAtPosition(position);
                /*String clickedLanguageName = clickedItem.getLanguage();
                Toast.makeText(SettingsFragment.this, clickedLanguageName + "selected",
                        Toast.LENGTH_SHORT).show();*/
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mSettingsViewModel = new ViewModelProvider(this).get(SettingsViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void initCountryList() {
        mCountryArrayList = new ArrayList<>();
        mCountryArrayList.add(new CountryItem(R.drawable.united_arab_emirates,
                R.string.united_arab_emirates, R.string.united_arab_emirates_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.afghanistan,
                R.string.afghanistan, R.string.afghanistan_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.albania,
                R.string.albania, R.string.albania_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.algeria,
                R.string.algeria, R.string.algeria_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.andorra,
                R.string.andorra, R.string.andorra_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.angola,
                R.string.angola, R.string.angola_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.anguilla,
                R.string.anguilla, R.string.anguilla_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.argentina,
                R.string.argentina, R.string.argentina_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.armenia,
                R.string.armenia, R.string.armenia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.aruba,
                R.string.aruba, R.string.aruba_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.australia,
                R.string.australia, R.string.australia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.austria,
                R.string.austria, R.string.austria_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.azerbaijan,
                R.string.azerbaijan, R.string.azerbaijan_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.bahamas,
                R.string.bahamas, R.string.bahamas_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.bahrain,
                R.string.bahrain, R.string.bahrain_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.bangladesh,
                R.string.bangladesh, R.string.bangladesh_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.barbados,
                R.string.barbados, R.string.barbados_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.belarus,
                R.string.belarus, R.string.belarus_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.belgium,
                R.string.belgium, R.string.belarus_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.belize,
                R.string.belize, R.string.belize_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.benin,
                R.string.benin, R.string.benin_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.bermuda,
                R.string.bermuda, R.string.bermuda_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.bhutan,
                R.string.bhutan, R.string.bhutan_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.bolivia,
                R.string.bolivia, R.string.bolivia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.bosnia_and_herzegovina,
                R.string.bosnia_and_herzegovina, R.string.bosnia_and_herzegovina_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.botswana,
                R.string.botswana, R.string.botswana_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.brazil,
                R.string.brazil, R.string.brazil_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.british_virgin_islands,
                R.string.british_virgin_islands, R.string.british_virgin_islands_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.brunei,
                R.string.brunei, R.string.brunei_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.bulgaria,
                R.string.bulgaria, R.string.bulgaria_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.burkina_faso,
                R.string.burkina_faso, R.string.burkina_faso_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.burundi,
                R.string.burundi, R.string.burundi_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.cambodia,
                R.string.cambodia, R.string.cambodia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.cameroon,
                R.string.cameroon, R.string.cameroon_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.canada,
                R.string.canada, R.string.canada_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.cape_verde,
                R.string.cape_verde, R.string.cape_verde_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.cayman_islands,
                R.string.cayman_islands, R.string.cayman_islands_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.central_african_republic,
                R.string.central_african_republic, R.string.central_african_republic_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.chad,
                R.string.chad, R.string.chad_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.chile,
                R.string.chile, R.string.chile_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.china,
                R.string.china, R.string.china_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.colombia,
                R.string.colombia, R.string.colombia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.costa_rica,
                R.string.costa_rica, R.string.costa_rica_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.cote_divoire,
                R.string.cote_divoire, R.string.cote_divoire_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.croatia,
                R.string.croatia, R.string.croatia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.cuba,
                R.string.cuba, R.string.cuba_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.curacao,
                R.string.curacao, R.string.curacao_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.cyprus,
                R.string.cyprus, R.string.cyprus_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.czech_republic,
                R.string.czech_republic, R.string.czech_republic_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.democratic_republic_of_the_congo,
                R.string.democratic_republic_of_the_congo, R.string.democratic_republic_of_the_congo_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.denmark,
                R.string.denmark, R.string.denmark_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.djibouti,
                R.string.djibouti, R.string.djibouti_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.dominica,
                R.string.dominica, R.string.dominica_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.dominican_republic,
                R.string.dominican_republic, R.string.dominican_republic));
        mCountryArrayList.add(new CountryItem(R.drawable.east_timor,
                R.string.east_timor, R.string.east_timor_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.ecuador,
                R.string.ecuador, R.string.ecuador_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.egypt,
                R.string.egypt, R.string.egypt_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.el_salvador,
                R.string.el_salvador, R.string.el_salvador_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.equatorial_guinea,
                R.string.equatorial_guinea, R.string.equatorial_guinea_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.eritrea,
                R.string.eritrea, R.string.eritrea_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.estonia,
                R.string.estonia, R.string.estonia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.eswatini,
                R.string.eswatini, R.string.eswatini_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.ethiopia,
                R.string.ethiopia, R.string.ethiopia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.falkland_islands,
                R.string.falkland_islands, R.string.falkland_islands_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.faroe_islands,
                R.string.faroe_islands, R.string.faroe_islands_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.fiji,
                R.string.fiji, R.string.fiji_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.finland,
                R.string.finland, R.string.finland_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.france,
                R.string.france, R.string.france_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.french_guiana,
                R.string.french_guiana, R.string.french_guiana_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.french_polynesia,
                R.string.french_polynesia, R.string.french_polynesia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.gabon,
                R.string.gabon, R.string.gabon_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.gambia,
                R.string.gambia, R.string.gambia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.georgia,
                R.string.georgia, R.string.georgia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.germany,
                R.string.germany, R.string.germany_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.ghana,
                R.string.ghana, R.string.ghana_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.gibraltar,
                R.string.gibraltar, R.string.gibraltar_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.greece,
                R.string.greece, R.string.greece_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.greenland,
                R.string.greenland, R.string.greenland_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.grenada,
                R.string.grenada, R.string.grenada_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.guatemala,
                R.string.guatemala, R.string.guatemala_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.guernsey,
                R.string.guernsey, R.string.guernsey_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.guinea,
                R.string.guinea, R.string.guinea_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.guinea_bissau,
                R.string.guinea_bissau, R.string.guinea_bissau_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.guyana,
                R.string.guyana, R.string.guyana_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.haiti,
                R.string.haiti, R.string.haiti_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.honduras,
                R.string.honduras, R.string.honduras_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.hong_kong,
                R.string.hong_kong, R.string.hong_kong_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.hungary,
                R.string.hungary, R.string.hungary_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.iceland,
                R.string.iceland, R.string.iceland_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.india,
                R.string.india, R.string.india_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.indonesia,
                R.string.indonesia, R.string.indonesia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.iran,
                R.string.iran, R.string.iran_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.iraq,
                R.string.iraq, R.string.iraq_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.ireland,
                R.string.ireland, R.string.ireland_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.isle_of_man,
                R.string.isle_of_man, R.string.isle_of_man_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.israel,
                R.string.israel, R.string.israel_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.italy,
                R.string.italy, R.string.italy_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.jamaica,
                R.string.jamaica, R.string.jamaica_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.japan,
                R.string.japan, R.string.japan_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.jersey,
                R.string.jersey, R.string.jersey_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.jordan,
                R.string.jordan, R.string.jordan_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.kazakhstan,
                R.string.kazakhstan, R.string.kazakhstan_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.kenya,
                R.string.kenya, R.string.kenya_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.kosovo,
                R.string.kosovo, R.string.kosovo_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.kuwait,
                R.string.kuwait, R.string.kuwait_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.kyrgyzstan,
                R.string.kyrgyzstan, R.string.kyrgyzstan_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.laos,
                R.string.laos, R.string.laos_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.latvia,
                R.string.latvia, R.string.latvia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.lebanon,
                R.string.lebanon, R.string.lebanon_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.liberia,
                R.string.liberia, R.string.liberia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.libya,
                R.string.libya, R.string.libya_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.liechtenstein,
                R.string.liechtenstein, R.string.liechtenstein_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.lithuania,
                R.string.lithuania, R.string.lithuania_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.luxembourg,
                R.string.luxembourg, R.string.luxembourg_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.macao,
                R.string.macao, R.string.macao_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.madagascar,
                R.string.madagascar, R.string.madagascar_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.malawi,
                R.string.malawi, R.string.malawi_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.malaysia,
                R.string.malaysia, R.string.malaysia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.maldives,
                R.string.maldives, R.string.maldives_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.mali,
                R.string.mali, R.string.mali_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.malta,
                R.string.malta, R.string.malta_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.mauritania,
                R.string.mauritania, R.string.mauritania_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.mauritius,
                R.string.mauritius, R.string.mauritius_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.mexico,
                R.string.mexico, R.string.mexico_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.moldova,
                R.string.moldova, R.string.moldova_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.monaco,
                R.string.monaco, R.string.monaco_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.mongolia,
                R.string.mongolia, R.string.mongolia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.montenegro,
                R.string.montenegro, R.string.montenegro_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.montserrat,
                R.string.montserrat, R.string.montserrat_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.morocco,
                R.string.morocco, R.string.morocco_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.mozambique,
                R.string.mozambique, R.string.mozambique_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.myanmar,
                R.string.myanmar, R.string.myanmar_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.namibia,
                R.string.namibia, R.string.namibia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.nepal,
                R.string.nepal, R.string.nepal_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.netherlands,
                R.string.netherlands, R.string.netherlands_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.new_caledonia,
                R.string.new_caledonia, R.string.new_caledonia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.new_zealand,
                R.string.new_zealand, R.string.nicaragua));
        mCountryArrayList.add(new CountryItem(R.drawable.niger,
                R.string.niger, R.string.niger_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.nigeria,
                R.string.nigeria, R.string.nigeria_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.north_macedonia,
                R.string.north_macedonia, R.string.north_macedonia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.norway,
                R.string.norway, R.string.norway));
        mCountryArrayList.add(new CountryItem(R.drawable.oman,
                R.string.oman, R.string.oman_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.pakistan,
                R.string.pakistan, R.string.pakistan_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.palestine,
                R.string.palestine, R.string.palestine_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.panama,
                R.string.panama, R.string.panama_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.papua_new_guinea,
                R.string.papua_new_guinea, R.string.papua_new_guinea_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.paraguay,
                R.string.paraguay, R.string.paraguay_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.peru,
                R.string.peru, R.string.peru_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.philippines,
                R.string.philippines, R.string.philippines_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.poland,
                R.string.poland, R.string.poland_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.portugal,
                R.string.portugal, R.string.portugal_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.qatar,
                R.string.qatar, R.string.qatar_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.republic_of_the_congo,
                R.string.republic_of_the_congo, R.string.republic_of_the_congo_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.romania,
                R.string.romania, R.string.romania_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.russia,
                R.string.russia, R.string.russia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.rwanda,
                R.string.rwanda, R.string.rwanda_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.saint_lucia,
                R.string.saint_lucia, R.string.saint_lucia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.san_marino,
                R.string.san_marino, R.string.san_marino_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.saudi_arabia,
                R.string.saudi_arabia, R.string.saudi_arabia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.senegal,
                R.string.senegal, R.string.senegal_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.serbia,
                R.string.serbia, R.string.serbia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.seychelles,
                R.string.seychelles, R.string.seychelles_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.sierra_leone,
                R.string.sierra_leone, R.string.sierra_leone_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.singapore,
                R.string.singapore, R.string.singapore_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.slovakia,
                R.string.slovakia, R.string.slovakia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.slovenia,
                R.string.slovenia, R.string.slovenia));
        mCountryArrayList.add(new CountryItem(R.drawable.somalia,
                R.string.somalia, R.string.somalia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.south_africa,
                R.string.south_africa, R.string.south_africa_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.south_korea,
                R.string.south_korea, R.string.south_korea_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.south_sudan,
                R.string.south_sudan, R.string.south_sudan_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.spain,
                R.string.spain, R.string.spain_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.sri_lanka,
                R.string.sri_lanka, R.string.sri_lanka_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.sudan,
                R.string.sudan, R.string.sudan_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.suriname,
                R.string.suriname, R.string.suriname_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.sweden,
                R.string.sweden, R.string.sweden_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.switzerland,
                R.string.switzerland, R.string.switzerland_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.syria,
                R.string.syria, R.string.syria_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.taiwan,
                R.string.taiwan, R.string.taiwan_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.tajikistan,
                R.string.tajikistan, R.string.tajikistan_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.tanzania,
                R.string.tanzania, R.string.tanzania_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.thailand,
                R.string.thailand, R.string.thailand_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.togo,
                R.string.togo, R.string.togo_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.tunisia,
                R.string.tunisia, R.string.tunisia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.turkey,
                R.string.turkey, R.string.turkey_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.turkmenistan,
                R.string.turkmenistan, R.string.turkmenistan_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.uganda,
                R.string.uganda, R.string.uganda_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.ukraine,
                R.string.ukraine, R.string.ukraine_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.united_arab_emirates,
                R.string.united_arab_emirates, R.string.united_arab_emirates_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.united_kingdom,
                R.string.united_kingdom, R.string.united_kingdom_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.united_states,
                R.string.united_states, R.string.united_states_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.uruguay,
                R.string.uruguay, R.string.uruguay_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.uzbekistan,
                R.string.uzbekistan, R.string.uzbekistan_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.vatican,
                R.string.vatican, R.string.vatican_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.venezuela,
                R.string.venezuela, R.string.venezuela_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.vietnam,
                R.string.vietnam, R.string.vietnam_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.yemen,
                R.string.yemen, R.string.yemen_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.zambia,
                R.string.zambia, R.string.zambia_currency));
        mCountryArrayList.add(new CountryItem(R.drawable.zimbabwe,
                R.string.zimbabwe, R.string.zimbabwe_currency));
    }

    private void initLanguageList() {
        mLanguageArrayList = new ArrayList<>();
        mLanguageArrayList.add(new LanguageItem(R.string.albanian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.amharic_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.arabic_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.armenian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.azerbaijani_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.belarusian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.bengali_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.bosnian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.bulgarian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.chinese_simplified_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.chinese_traditional_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.croatian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.czech_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.danish_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.dutch_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.english_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.estonian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.filipino_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.finnish_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.french_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.georgian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.german_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.greek_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.haitian_creole_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.hebrew_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.hindi_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.hungarian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.icelandic_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.indonesian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.irish_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.italian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.japanese_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.kazakh_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.khmer_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.kinyarwanda_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.korean_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.kyrgyz_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.lao_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.latin_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.latvian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.lithuanian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.luxembourgish_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.macedonian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.malagasy_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.malay_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.maltese_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.maori_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.mongolian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.myanmar_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.nepali_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.norwegian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.pashto_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.persian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.polish_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.portuguese_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.romanian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.russian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.serbian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.sinhala_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.slovak_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.slovenian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.somali_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.spanish_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.swahili_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.swedish_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.tajik_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.thai_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.turkish_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.turkmen_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.ukrainian_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.urdu_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.uzbek_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.vietnamese_lang_btn_text));
        mLanguageArrayList.add(new LanguageItem(R.string.zulu_lang_btn_text));
    }
}
