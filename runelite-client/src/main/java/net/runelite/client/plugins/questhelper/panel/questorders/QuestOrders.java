/*
 * Copyright (c) 2021, Zoinkwiz
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.questhelper.panel.questorders;

import com.google.common.collect.ImmutableList;
import net.runelite.client.plugins.questhelper.QuestHelperQuest;
import net.runelite.client.plugins.questhelper.questhelpers.QuestHelper;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import lombok.Getter;

public class QuestOrders
{
	// Test for 'The', 'A', 'An' at the start of a string followed by a word boundary (space/tab); this ignores case sensitivity
	private static final Pattern QUEST_NAME_PATTERN = Pattern.compile("(?i)(a\\b)|(the\\b)|(an\\b)", Pattern.CASE_INSENSITIVE);
	@Getter
	private static final List<QuestHelperQuest> optimalOrder = ImmutableList.of(
		QuestHelperQuest.COOKS_ASSISTANT,
		QuestHelperQuest.SHEEP_SHEARER,
		QuestHelperQuest.X_MARKS_THE_SPOT,
		QuestHelperQuest.PIRATES_TREASURE,
		QuestHelperQuest.THE_RESTLESS_GHOST,
		//QuestHelperQuest.STRONGHOLD_OF_SECURITY - Placeholder for future addition.
		QuestHelperQuest.ROMEO__JULIET,
		QuestHelperQuest.IMP_CATCHER,
		QuestHelperQuest.RUNE_MYSTERIES,
		QuestHelperQuest.MISTHALIN_MYSTERY,
		QuestHelperQuest.WITCHS_POTION,
		QuestHelperQuest.CLIENT_OF_KOUREND,
		QuestHelperQuest.DWARF_CANNON,
		QuestHelperQuest.WATERFALL_QUEST,
		QuestHelperQuest.TREE_GNOME_VILLAGE,
		QuestHelperQuest.MONKS_FRIEND,
		QuestHelperQuest.HAZEEL_CULT,
		QuestHelperQuest.SHEEP_HERDER,
		QuestHelperQuest.PLAGUE_CITY,
		QuestHelperQuest.BIOHAZARD,
		QuestHelperQuest.MURDER_MYSTERY,
		QuestHelperQuest.MERLINS_CRYSTAL,
		QuestHelperQuest.HOLY_GRAIL,
		QuestHelperQuest.PRINCE_ALI_RESCUE,
		QuestHelperQuest.DORICS_QUEST,
		QuestHelperQuest.DRUIDIC_RITUAL,
		QuestHelperQuest.WITCHS_HOUSE,
		QuestHelperQuest.BELOW_ICE_MOUNTAIN,
		QuestHelperQuest.BLACK_KNIGHTS_FORTRESS,
		QuestHelperQuest.RECRUITMENT_DRIVE,
		QuestHelperQuest.OBSERVATORY_QUEST,
		QuestHelperQuest.GERTRUDES_CAT,
		// https://oldschool.runescape.wiki/w/Natural_history_quiz
		QuestHelperQuest.PRIEST_IN_PERIL,
		QuestHelperQuest.NATURE_SPIRIT,
		QuestHelperQuest.FIGHT_ARENA,
		QuestHelperQuest.JUNGLE_POTION,
		QuestHelperQuest.VAMPYRE_SLAYER,
		QuestHelperQuest.A_PORCINE_OF_INTEREST,
		QuestHelperQuest.DEATH_PLATEAU,
		QuestHelperQuest.GOBLIN_DIPLOMACY,
		QuestHelperQuest.THE_QUEEN_OF_THIEVES,
		QuestHelperQuest.THE_DEPTHS_OF_DESPAIR,
		QuestHelperQuest.MOUNTAIN_DAUGHTER,
		QuestHelperQuest.ICTHLARINS_LITTLE_HELPER,
        	QuestHelperQuest.THE_GOLEM,
		QuestHelperQuest.THE_GRAND_TREE,
		QuestHelperQuest.ALFRED_GRIMHANDS_BARCRAWL,
		QuestHelperQuest.SCORPION_CATCHER,
		QuestHelperQuest.TRIBAL_TOTEM,
		QuestHelperQuest.THE_KNIGHTS_SWORD,
		QuestHelperQuest.DEMON_SLAYER,
		QuestHelperQuest.SHIELD_OF_ARRAV_BLACK_ARM_GANG,
		QuestHelperQuest.SHIELD_OF_ARRAV_PHOENIX_GANG,
		QuestHelperQuest.THE_LOST_TRIBE,
		QuestHelperQuest.DEATH_TO_THE_DORGESHUUN,
		QuestHelperQuest.THE_DIG_SITE,
		QuestHelperQuest.A_SOULS_BANE,
		QuestHelperQuest.BONE_VOYAGE,
		QuestHelperQuest.ELEMENTAL_WORKSHOP_I,
		QuestHelperQuest.ELEMENTAL_WORKSHOP_II,
		QuestHelperQuest.RECIPE_FOR_DISASTER_START,
		QuestHelperQuest.RECIPE_FOR_DISASTER_WARTFACE_AND_BENTNOZE,
		QuestHelperQuest.LOST_CITY,
		QuestHelperQuest.FAIRYTALE_I__GROWING_PAINS,
		QuestHelperQuest.SHILO_VILLAGE,
		QuestHelperQuest.FISHING_CONTEST,
		QuestHelperQuest.RECIPE_FOR_DISASTER_DWARF,
		QuestHelperQuest.RAG_AND_BONE_MAN_I,
		QuestHelperQuest.GHOSTS_AHOY,
		QuestHelperQuest.CREATURE_OF_FENKENSTRAIN,
		QuestHelperQuest.MAKING_HISTORY,
		QuestHelperQuest.ONE_SMALL_FAVOUR,
		QuestHelperQuest.ENTER_THE_ABYSS,
		QuestHelperQuest.WILDERNESS_EASY,
		QuestHelperQuest.WANTED,
		QuestHelperQuest.DESERT_EASY,
		QuestHelperQuest.A_TAIL_OF_TWO_CATS,
		QuestHelperQuest.THE_FEUD,
		QuestHelperQuest.ARDOUGNE_EASY,
		QuestHelperQuest.WATCHTOWER,
		QuestHelperQuest.DADDYS_HOME,
		QuestHelperQuest.IN_SEARCH_OF_THE_MYREQUE,
		QuestHelperQuest.SHADES_OF_MORTTON,
		QuestHelperQuest.IN_AID_OF_THE_MYREQUE,
		QuestHelperQuest.DARKNESS_OF_HALLOWVALE,
		QuestHelperQuest.TOWER_OF_LIFE,
		QuestHelperQuest.THE_GIANT_DWARF,
		QuestHelperQuest.FORGETTABLE_TALE,
		QuestHelperQuest.ANOTHER_SLICE_OF_HAM,
		QuestHelperQuest.RATCATCHERS,
		QuestHelperQuest.TROLL_STRONGHOLD,
		QuestHelperQuest.TROLL_ROMANCE,
		QuestHelperQuest.GARDEN_OF_TRANQUILLITY,
		QuestHelperQuest.ENLIGHTENED_JOURNEY,
		QuestHelperQuest.THE_ASCENT_OF_ARCEUUS,
		QuestHelperQuest.SHADOW_OF_THE_STORM,
		QuestHelperQuest.HORROR_FROM_THE_DEEP,
		QuestHelperQuest.ERNEST_THE_CHICKEN,
		QuestHelperQuest.ANIMAL_MAGNETISM,
		QuestHelperQuest.RECIPE_FOR_DISASTER_EVIL_DAVE,
		QuestHelperQuest.THE_CORSAIR_CURSE,
		QuestHelperQuest.BIG_CHOMPY_BIRD_HUNTING,
		QuestHelperQuest.ZOGRE_FLESH_EATERS,
		QuestHelperQuest.RECIPE_FOR_DISASTER_PIRATE_PETE,
		QuestHelperQuest.KARAMJA_EASY,
		QuestHelperQuest.KANDARIN_EASY,
		QuestHelperQuest.FALADOR_EASY,
		QuestHelperQuest.LUMBRIDGE_EASY,
		QuestHelperQuest.MORYTANIA_EASY,
		QuestHelperQuest.VARROCK_EASY,
		QuestHelperQuest.THE_TOURIST_TRAP,
		QuestHelperQuest.SPIRITS_OF_THE_ELID,
		QuestHelperQuest.THE_FREMENNIK_TRIALS,
		QuestHelperQuest.THE_FREMENNIK_ISLES,
		QuestHelperQuest.EADGARS_RUSE,
		QuestHelperQuest.UNDERGROUND_PASS,
		QuestHelperQuest.SEA_SLUG,
		QuestHelperQuest.TAI_BWO_WANNAI_TRIO,
		QuestHelperQuest.MY_ARMS_BIG_ADVENTURE,
		QuestHelperQuest.FREMENNIK_EASY,
		QuestHelperQuest.THE_SLUG_MENACE,
		//QuestHelperQuest.BALLOON_TRANSPORT_CRAFTING_GUILD - Placeholder for addition in future.
		QuestHelperQuest.GETTING_AHEAD,
		QuestHelperQuest.KOUREND_EASY,
		QuestHelperQuest.TALE_OF_THE_RIGHTEOUS,
		QuestHelperQuest.THE_FORSAKEN_TOWER,
		QuestHelperQuest.IN_SEARCH_OF_KNOWLEDGE,
		QuestHelperQuest.ARCHITECTURAL_ALLIANCE,
		QuestHelperQuest.COLD_WAR,
		QuestHelperQuest.WESTERN_EASY,
		QuestHelperQuest.TEMPLE_OF_IKOV,
		QuestHelperQuest.WHAT_LIES_BELOW,
		QuestHelperQuest.SKIPPY_AND_THE_MOGRES,
		QuestHelperQuest.FALADOR_MEDIUM,
		QuestHelperQuest.EAGLES_PEAK,
		QuestHelperQuest.DRAGON_SLAYER_I,
		QuestHelperQuest.HAUNTED_MINE,
		QuestHelperQuest.MONKEY_MADNESS_I,
		QuestHelperQuest.CONTACT,
		QuestHelperQuest.RECIPE_FOR_DISASTER_LUMBRIDGE_GUIDE,
		QuestHelperQuest.RECIPE_FOR_DISASTER_SKRACH_UGLOGWEE,
		QuestHelperQuest.THE_EYES_OF_GLOUPHRIE,
		//QuestHelperQuest.BALLOON_TRANSPORT_VARROCK - Placeholder for later addition.
		QuestHelperQuest.VARROCK_MEDIUM,
		QuestHelperQuest.OLAFS_QUEST,
		//QuestHelperQuest.BALLOON_TRANSPORT_CASTLE_WARS - Placeholder for later addition.
		QuestHelperQuest.TEARS_OF_GUTHIX,
		QuestHelperQuest.LUMBRIDGE_MEDIUM,
		QuestHelperQuest.BETWEEN_A_ROCK,
		QuestHelperQuest.THE_HAND_IN_THE_SAND,
		QuestHelperQuest.A_TASTE_OF_HOPE,
		QuestHelperQuest.LAIR_OF_TARN_RAZORLOR,
		QuestHelperQuest.RAG_AND_BONE_MAN_II,
		QuestHelperQuest.WESTERN_MEDIUM,
		QuestHelperQuest.ENAKHRAS_LAMENT,
		QuestHelperQuest.DESERT_MEDIUM,
		QuestHelperQuest.RUM_DEAL,
		QuestHelperQuest.CABIN_FEVER,
		QuestHelperQuest.MORYTANIA_MEDIUM,
		QuestHelperQuest.THE_GREAT_BRAIN_ROBBERY,
		QuestHelperQuest.DESERT_TREASURE,
		QuestHelperQuest.CURSE_OF_THE_EMPTY_LORD,
		QuestHelperQuest.THE_GENERALS_SHADOW,
		QuestHelperQuest.ARDOUGNE_MEDIUM,
		QuestHelperQuest.HEROES_QUEST,
		QuestHelperQuest.THRONE_OF_MISCELLANIA,
		QuestHelperQuest.ROYAL_TROUBLE,
		QuestHelperQuest.FAMILY_CREST,
		QuestHelperQuest.LEGENDS_QUEST,
		QuestHelperQuest.RECIPE_FOR_DISASTER_SIR_AMIK_VARZE,
		// "All remaining easy achievement diaries"
		QuestHelperQuest.KANDARIN_MEDIUM,
		QuestHelperQuest.FAIRYTALE_II__CURE_A_QUEEN,
		QuestHelperQuest.A_KINGDOM_DIVIDED,
		QuestHelperQuest.RECIPE_FOR_DISASTER_MONKEY_AMBASSADOR,
		QuestHelperQuest.REGICIDE,
		QuestHelperQuest.ROVING_ELVES,
		QuestHelperQuest.MOURNINGS_END_PART_I,
		QuestHelperQuest.MOURNINGS_END_PART_II,
		QuestHelperQuest.LUNAR_DIPLOMACY,
		QuestHelperQuest.KINGS_RANSOM,
		QuestHelperQuest.KNIGHT_WAVES_TRAINING_GROUNDS,
		QuestHelperQuest.SWAN_SONG,
		QuestHelperQuest.RECIPE_FOR_DISASTER_FINALE,
		QuestHelperQuest.WILDERNESS_MEDIUM,
		QuestHelperQuest.DEVIOUS_MINDS,
		QuestHelperQuest.GRIM_TALES,
		QuestHelperQuest.DREAM_MENTOR,
		QuestHelperQuest.KARAMJA_MEDIUM,
		QuestHelperQuest.KOUREND_MEDIUM,
		QuestHelperQuest.THE_FREMENNIK_EXILES,
		QuestHelperQuest.SINS_OF_THE_FATHER,
		//QuestHelperQuest.BALLOON_TRANSPORT_GRAND_TREE - Placeholder for later addition.
		QuestHelperQuest.MAKING_FRIENDS_WITH_MY_ARM,
		QuestHelperQuest.MONKEY_MADNESS_II,
		// "All remaining medium achievement diaries"
		QuestHelperQuest.FREMENNIK_MEDIUM,
		QuestHelperQuest.A_NIGHT_AT_THE_THEATRE,
		QuestHelperQuest.DRAGON_SLAYER_II,
		QuestHelperQuest.SONG_OF_THE_ELVES,
		QuestHelperQuest.CLOCK_TOWER,
		// Remaining section is unordered as not part of list
		QuestHelperQuest.BEAR_YOUR_SOUL,
		QuestHelperQuest.ENCHANTED_KEY,
		QuestHelperQuest.FAMILY_PEST,
		QuestHelperQuest.THE_MAGE_ARENA,
		QuestHelperQuest.THE_MAGE_ARENA_II,
		QuestHelperQuest.ARDOUGNE_HARD,
		QuestHelperQuest.ARDOUGNE_ELITE,
		QuestHelperQuest.DESERT_HARD,
		QuestHelperQuest.DESERT_ELITE,
		QuestHelperQuest.FALADOR_HARD,
		QuestHelperQuest.FALADOR_ELITE,
		QuestHelperQuest.FREMENNIK_HARD,
		QuestHelperQuest.FREMENNIK_ELITE,
		QuestHelperQuest.KANDARIN_HARD,
		QuestHelperQuest.KANDARIN_ELITE,
		QuestHelperQuest.KARAMJA_HARD,
		QuestHelperQuest.KARAMJA_ELITE,
		QuestHelperQuest.KOUREND_HARD,
		QuestHelperQuest.KOUREND_ELITE,
		QuestHelperQuest.LUMBRIDGE_HARD,
		QuestHelperQuest.LUMBRIDGE_ELITE,
		QuestHelperQuest.MORYTANIA_HARD,
		QuestHelperQuest.MORYTANIA_ELITE,
		QuestHelperQuest.VARROCK_HARD,
		QuestHelperQuest.VARROCK_ELITE,
		QuestHelperQuest.WESTERN_HARD,
		QuestHelperQuest.WESTERN_ELITE,
		QuestHelperQuest.WILDERNESS_HARD,
		QuestHelperQuest.WILDERNESS_ELITE
	);
	@Getter
	private static final List<QuestHelperQuest> optimalIronmanOrder = ImmutableList.of(
		QuestHelperQuest.COOKS_ASSISTANT,
		QuestHelperQuest.SHEEP_SHEARER,
		QuestHelperQuest.MISTHALIN_MYSTERY,
		QuestHelperQuest.THE_RESTLESS_GHOST,
		QuestHelperQuest.X_MARKS_THE_SPOT,
		QuestHelperQuest.WITCHS_POTION,
		QuestHelperQuest.IMP_CATCHER,
		QuestHelperQuest.CLIENT_OF_KOUREND,
		QuestHelperQuest.ROMEO__JULIET,
		QuestHelperQuest.GERTRUDES_CAT,
		QuestHelperQuest.DADDYS_HOME,
		QuestHelperQuest.RUNE_MYSTERIES,
		QuestHelperQuest.TREE_GNOME_VILLAGE,
		QuestHelperQuest.MONKS_FRIEND,
		QuestHelperQuest.HAZEEL_CULT,
		QuestHelperQuest.PLAGUE_CITY,
		QuestHelperQuest.BIOHAZARD,
		QuestHelperQuest.FIGHT_ARENA,
		QuestHelperQuest.DWARF_CANNON,
		QuestHelperQuest.WATERFALL_QUEST,
		QuestHelperQuest.MURDER_MYSTERY,
		QuestHelperQuest.MERLINS_CRYSTAL,
		QuestHelperQuest.HOLY_GRAIL,
		QuestHelperQuest.DRUIDIC_RITUAL,
		QuestHelperQuest.WITCHS_HOUSE,
		QuestHelperQuest.BELOW_ICE_MOUNTAIN,
		QuestHelperQuest.BLACK_KNIGHTS_FORTRESS,
		QuestHelperQuest.RECRUITMENT_DRIVE,
		QuestHelperQuest.OBSERVATORY_QUEST,
		QuestHelperQuest.PRIEST_IN_PERIL,
		QuestHelperQuest.RAG_AND_BONE_MAN_I,
		QuestHelperQuest.NATURE_SPIRIT,
		QuestHelperQuest.ALFRED_GRIMHANDS_BARCRAWL,
		QuestHelperQuest.SCORPION_CATCHER,
		QuestHelperQuest.JUNGLE_POTION,
		QuestHelperQuest.VAMPYRE_SLAYER,
		QuestHelperQuest.DEATH_PLATEAU,
		QuestHelperQuest.GOBLIN_DIPLOMACY,
		QuestHelperQuest.THE_QUEEN_OF_THIEVES,
		QuestHelperQuest.THE_DEPTHS_OF_DESPAIR,
		QuestHelperQuest.MOUNTAIN_DAUGHTER,
		QuestHelperQuest.ICTHLARINS_LITTLE_HELPER,
		QuestHelperQuest.THE_GRAND_TREE,
		QuestHelperQuest.TRIBAL_TOTEM,
		QuestHelperQuest.THE_DIG_SITE,
		QuestHelperQuest.THE_GOLEM,
		QuestHelperQuest.THE_KNIGHTS_SWORD,
		QuestHelperQuest.ELEMENTAL_WORKSHOP_I,
		QuestHelperQuest.RECIPE_FOR_DISASTER_START,
		QuestHelperQuest.RECIPE_FOR_DISASTER_WARTFACE_AND_BENTNOZE,
		QuestHelperQuest.DEMON_SLAYER,
		QuestHelperQuest.SHADOW_OF_THE_STORM,
		QuestHelperQuest.ELEMENTAL_WORKSHOP_II,
		QuestHelperQuest.LOST_CITY,
		QuestHelperQuest.FAIRYTALE_I__GROWING_PAINS,
		QuestHelperQuest.SHIELD_OF_ARRAV_BLACK_ARM_GANG,
		QuestHelperQuest.SHIELD_OF_ARRAV_PHOENIX_GANG,
		QuestHelperQuest.CREATURE_OF_FENKENSTRAIN,
		QuestHelperQuest.A_SOULS_BANE,
		QuestHelperQuest.THE_LOST_TRIBE,
		QuestHelperQuest.DEATH_TO_THE_DORGESHUUN,
		QuestHelperQuest.THE_GIANT_DWARF,
		QuestHelperQuest.ANOTHER_SLICE_OF_HAM,
		QuestHelperQuest.MAKING_HISTORY,
		QuestHelperQuest.IN_SEARCH_OF_THE_MYREQUE,
		QuestHelperQuest.SHADES_OF_MORTTON,
		QuestHelperQuest.IN_AID_OF_THE_MYREQUE,
		QuestHelperQuest.BONE_VOYAGE,
		QuestHelperQuest.ENTER_THE_ABYSS,
		QuestHelperQuest.WANTED,
		QuestHelperQuest.THE_FEUD,
		QuestHelperQuest.TROLL_STRONGHOLD,
		QuestHelperQuest.TROLL_ROMANCE,
		QuestHelperQuest.DRAGON_SLAYER_I,
		QuestHelperQuest.HORROR_FROM_THE_DEEP,
		QuestHelperQuest.A_PORCINE_OF_INTEREST,
		QuestHelperQuest.ERNEST_THE_CHICKEN,
		QuestHelperQuest.ANIMAL_MAGNETISM,
		QuestHelperQuest.SHILO_VILLAGE,
		QuestHelperQuest.DORICS_QUEST,
		QuestHelperQuest.SPIRITS_OF_THE_ELID,
		QuestHelperQuest.DARKNESS_OF_HALLOWVALE,
		QuestHelperQuest.TOWER_OF_LIFE,
		QuestHelperQuest.FISHING_CONTEST,
		QuestHelperQuest.RECIPE_FOR_DISASTER_DWARF,
		QuestHelperQuest.GHOSTS_AHOY,
		QuestHelperQuest.FORGETTABLE_TALE,
		QuestHelperQuest.GARDEN_OF_TRANQUILLITY,
		QuestHelperQuest.ENLIGHTENED_JOURNEY,
		QuestHelperQuest.RECIPE_FOR_DISASTER_EVIL_DAVE,
		QuestHelperQuest.BIG_CHOMPY_BIRD_HUNTING,
		QuestHelperQuest.ZOGRE_FLESH_EATERS,
		QuestHelperQuest.RECIPE_FOR_DISASTER_PIRATE_PETE,
		QuestHelperQuest.TAI_BWO_WANNAI_TRIO,
		QuestHelperQuest.THE_TOURIST_TRAP,
		QuestHelperQuest.EADGARS_RUSE,
		QuestHelperQuest.MY_ARMS_BIG_ADVENTURE,
		QuestHelperQuest.THE_FREMENNIK_TRIALS,
		QuestHelperQuest.THE_FREMENNIK_ISLES,
		QuestHelperQuest.GETTING_AHEAD,
		QuestHelperQuest.RECIPE_FOR_DISASTER_LUMBRIDGE_GUIDE,
		QuestHelperQuest.RECIPE_FOR_DISASTER_SKRACH_UGLOGWEE,
		QuestHelperQuest.HAUNTED_MINE,
		QuestHelperQuest.WATCHTOWER,
		QuestHelperQuest.PRINCE_ALI_RESCUE,
		QuestHelperQuest.CONTACT,
		QuestHelperQuest.THE_EYES_OF_GLOUPHRIE,
		QuestHelperQuest.SEA_SLUG,
		QuestHelperQuest.OLAFS_QUEST,
		QuestHelperQuest.TEARS_OF_GUTHIX,
		QuestHelperQuest.RATCATCHERS,
		QuestHelperQuest.TEMPLE_OF_IKOV,
		QuestHelperQuest.ONE_SMALL_FAVOUR,
		QuestHelperQuest.A_TAIL_OF_TWO_CATS,
		QuestHelperQuest.THE_SLUG_MENACE,
		QuestHelperQuest.BETWEEN_A_ROCK,
		QuestHelperQuest.MONKEY_MADNESS_I,
		QuestHelperQuest.COLD_WAR,
		QuestHelperQuest.THE_ASCENT_OF_ARCEUUS,
		QuestHelperQuest.EAGLES_PEAK,
		QuestHelperQuest.UNDERGROUND_PASS,
		QuestHelperQuest.SKIPPY_AND_THE_MOGRES,
		QuestHelperQuest.RAG_AND_BONE_MAN_II,
		QuestHelperQuest.LAIR_OF_TARN_RAZORLOR,
		QuestHelperQuest.RUM_DEAL,
		QuestHelperQuest.PIRATES_TREASURE,
		QuestHelperQuest.CABIN_FEVER,
		QuestHelperQuest.THE_GREAT_BRAIN_ROBBERY,
		QuestHelperQuest.THE_HAND_IN_THE_SAND,
		QuestHelperQuest.ENAKHRAS_LAMENT,
		QuestHelperQuest.HEROES_QUEST,
		QuestHelperQuest.THRONE_OF_MISCELLANIA,
		QuestHelperQuest.ROYAL_TROUBLE,
		QuestHelperQuest.DESERT_TREASURE,
		QuestHelperQuest.CURSE_OF_THE_EMPTY_LORD,
		QuestHelperQuest.THE_GENERALS_SHADOW,
		QuestHelperQuest.A_TASTE_OF_HOPE,
		QuestHelperQuest.FAMILY_CREST,
		QuestHelperQuest.LEGENDS_QUEST,
		QuestHelperQuest.RECIPE_FOR_DISASTER_SIR_AMIK_VARZE,
		QuestHelperQuest.KARAMJA_EASY,
		QuestHelperQuest.KANDARIN_EASY,
		QuestHelperQuest.FALADOR_EASY,
		QuestHelperQuest.VARROCK_EASY,
		QuestHelperQuest.FREMENNIK_EASY,
		QuestHelperQuest.WILDERNESS_EASY,
		QuestHelperQuest.DESERT_EASY,
		QuestHelperQuest.ARDOUGNE_EASY,
		QuestHelperQuest.LUMBRIDGE_EASY,
		QuestHelperQuest.MORYTANIA_EASY,
		QuestHelperQuest.KOUREND_EASY,
		QuestHelperQuest.WESTERN_EASY,
		QuestHelperQuest.ARDOUGNE_MEDIUM,
		QuestHelperQuest.FALADOR_MEDIUM,
		QuestHelperQuest.VARROCK_MEDIUM,
		QuestHelperQuest.KANDARIN_MEDIUM,
		QuestHelperQuest.FAIRYTALE_II__CURE_A_QUEEN,
		QuestHelperQuest.TALE_OF_THE_RIGHTEOUS,
		QuestHelperQuest.THE_FORSAKEN_TOWER,
		QuestHelperQuest.A_KINGDOM_DIVIDED,
		QuestHelperQuest.RECIPE_FOR_DISASTER_MONKEY_AMBASSADOR,
		QuestHelperQuest.REGICIDE,
		QuestHelperQuest.SHEEP_HERDER,
		QuestHelperQuest.ROVING_ELVES,
		QuestHelperQuest.MOURNINGS_END_PART_I,
		QuestHelperQuest.MOURNINGS_END_PART_II,
		QuestHelperQuest.LUNAR_DIPLOMACY,
		QuestHelperQuest.WHAT_LIES_BELOW,
		QuestHelperQuest.KINGS_RANSOM,
		QuestHelperQuest.KNIGHT_WAVES_TRAINING_GROUNDS,
		QuestHelperQuest.SWAN_SONG,
		QuestHelperQuest.RECIPE_FOR_DISASTER_FINALE,
		QuestHelperQuest.GRIM_TALES,
		QuestHelperQuest.DREAM_MENTOR,
		QuestHelperQuest.WILDERNESS_MEDIUM,
		QuestHelperQuest.KARAMJA_MEDIUM,
		QuestHelperQuest.KOUREND_MEDIUM,
		QuestHelperQuest.LUMBRIDGE_MEDIUM,
		QuestHelperQuest.MORYTANIA_MEDIUM,
		QuestHelperQuest.DEVIOUS_MINDS,
		QuestHelperQuest.THE_FREMENNIK_EXILES,
		QuestHelperQuest.SINS_OF_THE_FATHER,
		QuestHelperQuest.MAKING_FRIENDS_WITH_MY_ARM,
		QuestHelperQuest.MONKEY_MADNESS_II,
		QuestHelperQuest.FREMENNIK_MEDIUM,
		QuestHelperQuest.A_NIGHT_AT_THE_THEATRE,
		QuestHelperQuest.DRAGON_SLAYER_II,
		QuestHelperQuest.SONG_OF_THE_ELVES,
		QuestHelperQuest.THE_CORSAIR_CURSE,
		QuestHelperQuest.CLOCK_TOWER,

		// Remaining section is unordered as not part of list on https://oldschool.runescape.wiki/w/Optimal_quest_guide/Ironman

		//QuestHelperQuest.STRONGHOLD_OF_SECURITY - Placeholder for future addition.
		//QuestHelperQuest.BALLOON_TRANSPORT_CRAFTING_GUILD - Placeholder for addition in future.
		//QuestHelperQuest.BALLOON_TRANSPORT_GRAND_TREE - Placeholder for later addition.
		//QuestHelperQuest.BALLOON_TRANSPORT_VARROCK - Placeholder for later addition.
		//QuestHelperQuest.BALLOON_TRANSPORT_CASTLE_WARS - Placeholder for later addition.
		QuestHelperQuest.IN_SEARCH_OF_KNOWLEDGE,
		QuestHelperQuest.ARCHITECTURAL_ALLIANCE,
		QuestHelperQuest.BEAR_YOUR_SOUL,
		QuestHelperQuest.ENCHANTED_KEY,
		QuestHelperQuest.FAMILY_PEST,
		QuestHelperQuest.THE_MAGE_ARENA,
		QuestHelperQuest.THE_MAGE_ARENA_II,
		QuestHelperQuest.WESTERN_MEDIUM,
		QuestHelperQuest.DESERT_MEDIUM,
		QuestHelperQuest.ARDOUGNE_HARD,
		QuestHelperQuest.ARDOUGNE_ELITE,
		QuestHelperQuest.DESERT_HARD,
		QuestHelperQuest.DESERT_ELITE,
		QuestHelperQuest.FALADOR_HARD,
		QuestHelperQuest.FALADOR_ELITE,
		QuestHelperQuest.FREMENNIK_HARD,
		QuestHelperQuest.FREMENNIK_ELITE,
		QuestHelperQuest.KANDARIN_HARD,
		QuestHelperQuest.KANDARIN_ELITE,
		QuestHelperQuest.KARAMJA_HARD,
		QuestHelperQuest.KARAMJA_ELITE,
		QuestHelperQuest.KOUREND_HARD,
		QuestHelperQuest.KOUREND_ELITE,
		QuestHelperQuest.LUMBRIDGE_HARD,
		QuestHelperQuest.LUMBRIDGE_ELITE,
		QuestHelperQuest.MORYTANIA_HARD,
		QuestHelperQuest.MORYTANIA_ELITE,
		QuestHelperQuest.VARROCK_HARD,
		QuestHelperQuest.VARROCK_ELITE,
		QuestHelperQuest.WESTERN_HARD,
		QuestHelperQuest.WESTERN_ELITE,
		QuestHelperQuest.WILDERNESS_HARD,
		QuestHelperQuest.WILDERNESS_ELITE
	);
	@Getter
	private static final List<QuestHelperQuest> releaseOrder = ImmutableList.of(
		// Quests
		QuestHelperQuest.COOKS_ASSISTANT,
		QuestHelperQuest.DEMON_SLAYER,
		QuestHelperQuest.THE_RESTLESS_GHOST,
		QuestHelperQuest.ROMEO__JULIET,
		QuestHelperQuest.SHEEP_SHEARER,
		QuestHelperQuest.SHIELD_OF_ARRAV_BLACK_ARM_GANG,
		QuestHelperQuest.SHIELD_OF_ARRAV_PHOENIX_GANG,
		QuestHelperQuest.ERNEST_THE_CHICKEN,
		QuestHelperQuest.VAMPYRE_SLAYER,
		QuestHelperQuest.IMP_CATCHER,
		QuestHelperQuest.PRINCE_ALI_RESCUE,
		QuestHelperQuest.DORICS_QUEST,
		QuestHelperQuest.BLACK_KNIGHTS_FORTRESS,
		QuestHelperQuest.WITCHS_POTION,
		QuestHelperQuest.THE_KNIGHTS_SWORD,
		QuestHelperQuest.GOBLIN_DIPLOMACY,
		QuestHelperQuest.PIRATES_TREASURE,
		QuestHelperQuest.DRAGON_SLAYER_I,
		QuestHelperQuest.DRUIDIC_RITUAL,
		QuestHelperQuest.LOST_CITY,
		QuestHelperQuest.WITCHS_HOUSE,
		QuestHelperQuest.MERLINS_CRYSTAL,
		QuestHelperQuest.HEROES_QUEST,
		QuestHelperQuest.SCORPION_CATCHER,
		QuestHelperQuest.FAMILY_CREST,
		QuestHelperQuest.TRIBAL_TOTEM,
		QuestHelperQuest.FISHING_CONTEST,
		QuestHelperQuest.MONKS_FRIEND,
		QuestHelperQuest.TEMPLE_OF_IKOV,
		QuestHelperQuest.CLOCK_TOWER,
		QuestHelperQuest.HOLY_GRAIL,
		QuestHelperQuest.TREE_GNOME_VILLAGE,
		QuestHelperQuest.FIGHT_ARENA,
		QuestHelperQuest.HAZEEL_CULT,
		QuestHelperQuest.SHEEP_HERDER,
		QuestHelperQuest.PLAGUE_CITY,
		QuestHelperQuest.SEA_SLUG,
		QuestHelperQuest.WATERFALL_QUEST,
		QuestHelperQuest.BIOHAZARD,
		QuestHelperQuest.JUNGLE_POTION,
		QuestHelperQuest.THE_GRAND_TREE,
		QuestHelperQuest.SHILO_VILLAGE,
		QuestHelperQuest.UNDERGROUND_PASS,
		QuestHelperQuest.OBSERVATORY_QUEST,
		QuestHelperQuest.THE_TOURIST_TRAP,
		QuestHelperQuest.WATCHTOWER,
		QuestHelperQuest.DWARF_CANNON,
		QuestHelperQuest.MURDER_MYSTERY,
		QuestHelperQuest.THE_DIG_SITE,
		QuestHelperQuest.GERTRUDES_CAT,
		QuestHelperQuest.LEGENDS_QUEST,
		QuestHelperQuest.RUNE_MYSTERIES,
		QuestHelperQuest.BIG_CHOMPY_BIRD_HUNTING,
		QuestHelperQuest.ELEMENTAL_WORKSHOP_I,
		QuestHelperQuest.PRIEST_IN_PERIL,
		QuestHelperQuest.NATURE_SPIRIT,
		QuestHelperQuest.DEATH_PLATEAU,
		QuestHelperQuest.TROLL_STRONGHOLD,
		QuestHelperQuest.TAI_BWO_WANNAI_TRIO,
		QuestHelperQuest.REGICIDE,
		QuestHelperQuest.EADGARS_RUSE,
		QuestHelperQuest.SHADES_OF_MORTTON,
		QuestHelperQuest.THE_FREMENNIK_TRIALS,
		QuestHelperQuest.HORROR_FROM_THE_DEEP,
		QuestHelperQuest.THRONE_OF_MISCELLANIA,
		QuestHelperQuest.MONKEY_MADNESS_I,
		QuestHelperQuest.HAUNTED_MINE,
		QuestHelperQuest.TROLL_ROMANCE,
		QuestHelperQuest.IN_SEARCH_OF_THE_MYREQUE,
		QuestHelperQuest.CREATURE_OF_FENKENSTRAIN,
		QuestHelperQuest.ROVING_ELVES,
		QuestHelperQuest.GHOSTS_AHOY,
		QuestHelperQuest.ONE_SMALL_FAVOUR,
		QuestHelperQuest.MOUNTAIN_DAUGHTER,
		QuestHelperQuest.BETWEEN_A_ROCK,
		QuestHelperQuest.THE_FEUD,
		QuestHelperQuest.THE_GOLEM,
		QuestHelperQuest.DESERT_TREASURE,
		QuestHelperQuest.ICTHLARINS_LITTLE_HELPER,
		QuestHelperQuest.TEARS_OF_GUTHIX,
		QuestHelperQuest.ZOGRE_FLESH_EATERS,
		QuestHelperQuest.THE_LOST_TRIBE,
		QuestHelperQuest.THE_GIANT_DWARF,
		QuestHelperQuest.RECRUITMENT_DRIVE,
		QuestHelperQuest.MOURNINGS_END_PART_I,
		QuestHelperQuest.FORGETTABLE_TALE,
		QuestHelperQuest.GARDEN_OF_TRANQUILLITY,
		QuestHelperQuest.A_TAIL_OF_TWO_CATS,
		QuestHelperQuest.WANTED,
		QuestHelperQuest.MOURNINGS_END_PART_II,
		QuestHelperQuest.RUM_DEAL,
		QuestHelperQuest.SHADOW_OF_THE_STORM,
		QuestHelperQuest.MAKING_HISTORY,
		QuestHelperQuest.RATCATCHERS,
		QuestHelperQuest.SPIRITS_OF_THE_ELID,
		QuestHelperQuest.DEVIOUS_MINDS,
		QuestHelperQuest.THE_HAND_IN_THE_SAND,
		QuestHelperQuest.ENAKHRAS_LAMENT,
		QuestHelperQuest.CABIN_FEVER,
		QuestHelperQuest.FAIRYTALE_I__GROWING_PAINS,
		QuestHelperQuest.RECIPE_FOR_DISASTER,
		QuestHelperQuest.RECIPE_FOR_DISASTER_START,
		QuestHelperQuest.RECIPE_FOR_DISASTER_DWARF,
		QuestHelperQuest.RECIPE_FOR_DISASTER_WARTFACE_AND_BENTNOZE,
		QuestHelperQuest.RECIPE_FOR_DISASTER_PIRATE_PETE,
		QuestHelperQuest.RECIPE_FOR_DISASTER_LUMBRIDGE_GUIDE,
		QuestHelperQuest.RECIPE_FOR_DISASTER_EVIL_DAVE,
		QuestHelperQuest.RECIPE_FOR_DISASTER_MONKEY_AMBASSADOR,
		QuestHelperQuest.RECIPE_FOR_DISASTER_SIR_AMIK_VARZE,
		QuestHelperQuest.RECIPE_FOR_DISASTER_SKRACH_UGLOGWEE,
		QuestHelperQuest.RECIPE_FOR_DISASTER_FINALE,
		QuestHelperQuest.IN_AID_OF_THE_MYREQUE,
		QuestHelperQuest.A_SOULS_BANE,
		QuestHelperQuest.RAG_AND_BONE_MAN_I,
		QuestHelperQuest.RAG_AND_BONE_MAN_II,
		QuestHelperQuest.SWAN_SONG,
		QuestHelperQuest.ROYAL_TROUBLE,
		QuestHelperQuest.DEATH_TO_THE_DORGESHUUN,
		QuestHelperQuest.FAIRYTALE_II__CURE_A_QUEEN,
		QuestHelperQuest.LUNAR_DIPLOMACY,
		QuestHelperQuest.THE_EYES_OF_GLOUPHRIE,
		QuestHelperQuest.DARKNESS_OF_HALLOWVALE,
		QuestHelperQuest.THE_SLUG_MENACE,
		QuestHelperQuest.ELEMENTAL_WORKSHOP_II,
		QuestHelperQuest.MY_ARMS_BIG_ADVENTURE,
		QuestHelperQuest.ENLIGHTENED_JOURNEY,
		QuestHelperQuest.EAGLES_PEAK,
		QuestHelperQuest.ANIMAL_MAGNETISM,
		QuestHelperQuest.CONTACT,
		QuestHelperQuest.COLD_WAR,
		QuestHelperQuest.THE_FREMENNIK_ISLES,
		QuestHelperQuest.TOWER_OF_LIFE,
		QuestHelperQuest.THE_GREAT_BRAIN_ROBBERY,
		QuestHelperQuest.WHAT_LIES_BELOW,
		QuestHelperQuest.OLAFS_QUEST,
		QuestHelperQuest.ANOTHER_SLICE_OF_HAM,
		QuestHelperQuest.DREAM_MENTOR,
		QuestHelperQuest.GRIM_TALES,
		QuestHelperQuest.KINGS_RANSOM,
		QuestHelperQuest.MONKEY_MADNESS_II,
		QuestHelperQuest.MISTHALIN_MYSTERY,
		QuestHelperQuest.CLIENT_OF_KOUREND,
		QuestHelperQuest.BONE_VOYAGE,
		QuestHelperQuest.THE_QUEEN_OF_THIEVES,
		QuestHelperQuest.THE_DEPTHS_OF_DESPAIR,
		QuestHelperQuest.THE_CORSAIR_CURSE,
		QuestHelperQuest.DRAGON_SLAYER_II,
		QuestHelperQuest.TALE_OF_THE_RIGHTEOUS,
		QuestHelperQuest.A_TASTE_OF_HOPE,
		QuestHelperQuest.MAKING_FRIENDS_WITH_MY_ARM,
		QuestHelperQuest.THE_FORSAKEN_TOWER,
		QuestHelperQuest.THE_ASCENT_OF_ARCEUUS,
		QuestHelperQuest.X_MARKS_THE_SPOT,
		QuestHelperQuest.SONG_OF_THE_ELVES,
		QuestHelperQuest.THE_FREMENNIK_EXILES,
		QuestHelperQuest.SINS_OF_THE_FATHER,
		QuestHelperQuest.A_PORCINE_OF_INTEREST,
		QuestHelperQuest.GETTING_AHEAD,
		QuestHelperQuest.BELOW_ICE_MOUNTAIN,
		QuestHelperQuest.A_NIGHT_AT_THE_THEATRE,
		QuestHelperQuest.A_KINGDOM_DIVIDED,
		// Miniquests
		QuestHelperQuest.ALFRED_GRIMHANDS_BARCRAWL,
		QuestHelperQuest.THE_MAGE_ARENA,
		QuestHelperQuest.ENTER_THE_ABYSS,
		QuestHelperQuest.CURSE_OF_THE_EMPTY_LORD,
		QuestHelperQuest.SKIPPY_AND_THE_MOGRES,
		QuestHelperQuest.ENCHANTED_KEY,
		QuestHelperQuest.LAIR_OF_TARN_RAZORLOR,
		QuestHelperQuest.THE_GENERALS_SHADOW,
		QuestHelperQuest.ARCHITECTURAL_ALLIANCE,
		QuestHelperQuest.BEAR_YOUR_SOUL,
		QuestHelperQuest.FAMILY_PEST,
		QuestHelperQuest.THE_MAGE_ARENA_II,
		QuestHelperQuest.IN_SEARCH_OF_KNOWLEDGE,
		QuestHelperQuest.DADDYS_HOME
	);

	public static String normalizeQuestName(String questName)
	{
		return QUEST_NAME_PATTERN.matcher(questName).replaceAll("").trim();
	}

	public static Comparator<QuestHelper> sortOptimalOrder()
	{
		return Comparator.comparing(q -> getOptimalOrder().indexOf(q.getQuest()));
	}

	public static Comparator<QuestHelper> sortOptimalIronmanOrder()
	{
		return Comparator.comparing(q -> getOptimalIronmanOrder().indexOf(q.getQuest()));
	}

	public static Comparator<QuestHelper> sortAToZ()
	{
		return Comparator.comparing(q -> normalizeQuestName(q.getQuest().getName()));
	}

	public static Comparator<QuestHelper> sortZToA()
	{
		return Comparator.comparing(q -> normalizeQuestName(q.getQuest().getName()), Comparator.reverseOrder());
	}

	public static Comparator<QuestHelper> sortByRelease()
	{
		return Comparator.comparing(q -> getReleaseOrder().indexOf(q.getQuest()));
	}
}
