package com.journaldev.spring.constants;

import java.math.BigDecimal;
import java.util.Locale;


public class GboConstants {
	
	public static final Locale locale = new Locale("pt", "PT");
	
	public static final String ENCODING_UTF8 = "UTF-8";
	public static final String ENCODING = ENCODING_UTF8;
	
	public static final long MAX_HOURS_RANGE = 4;
	
	public long getMAX_HOURS_RANGE() { return MAX_HOURS_RANGE; }

	
	
	/*
	 * Privileged Station Type
	 */
	
	public static final int PRIVILEGED_STATION_TYPE = 4;
	
	public int getPRIVILEGED_STATION_TYPE() { return PRIVILEGED_STATION_TYPE; }
	
	
	/*
	 * Game Descriptions
	 */
	
	public static final String ALL_GAMES_DES = "Todos os Jogos";
	
	public String getALL_GAMES_DES() { return ALL_GAMES_DES; }
	
	
	/*
	 * Game IDs
	 */
	
	public static final int ALL_GAMES_ID	= 0;
	public static final int GAME_ID_EGA		= 1;
	public static final int GAME_ID_CMIL	= 2;
	public static final int GAME_ID_M1L		= 3;

	public int getGAME_ID_EGA() { return GAME_ID_EGA; }
	public int getGAME_ID_M1L() { return GAME_ID_M1L; }
	public int getGAME_ID_CMIL() { return GAME_ID_CMIL; }
	public int getALL_GAMES_ID() { return ALL_GAMES_ID; }
	
	
	/*
	 * Generic User Interface messages
	 */
	
	public static final String MSG_UI_GENERIC_NO_AUTENTICATION		= "Não foi possível determinar as suas credenciais. Por favor faça de novo login e tente novamente.";
	public static final String MSG_UI_GENERIC_ERROR_MSG				= "Não foi possível realizar o seu pedido. Tente novamente por favor.";
	public static final String MSG_UI_NO_PERMISSON_ERROR_MSG		= "Não tem permissão para aceder à área pretendida. Em caso de dúvida contacte o seu superior hierárquico.";
	public static final String MSG_UI_ACCESS_DENIED_ERROR_MSG		= "Não tem permissão para efetuar a operação pretendida. Em caso de dúvida contacte o seu superior hierárquico.";
	
	public static final String MSG_UI_GENERIC_NO_RESULTS			= "A sua pesquisa não retornou resultados.";
	public static final String MSG_UI_GENERIC_NO_RESEARCH_DATA 		= "Não existem dados para a pesquisa realizada.";
	public static final String MSG_UI_GENERIC_NO_CRITERIA			= "Não existem critérios para efetuar a pesquisa pretendida.";
	public static final String MSG_UI_GENERIC_CANT_PROC_CRIT		= "Não foi possível processar os critérios de pesquisa.";
	public static final String MSG_UI_GENERIC_NO_XML_TAG			= "Não foi possível encontrar uma ou mais tags XML ao ler o ficheiro!";
	
	public static final String MSG_UI_GENERIC_UPDATE_SUCCESS		= "Alterações gravadas com sucesso!";
	public static final String MSG_UI_GENERIC_NO_UPDATE_INPUT		= "Não foi possível determinar os campos a atualizar.";
	public static final String MSG_UI_GENERIC_NO_UPDATES_CRITERIA	= "Não foi possivel determinar quais os elementos a atualizar!";

	public static final String MSG_UI_GENERIC_NO_GAMES				= "Não foi possível determinar os jogos disponíveis.";
	public static final String MSG_UI_GENERIC_GAME_NO_CONTESTS		= "O jogo selecionado não tem sorteios disponíveis!";
	public static final String MSG_UI_GENERIC_GAME_NO_DRAWS			= "O jogo selecionado não tem concursos disponíveis!";
	public static final String MSG_UI_GENERIC_GAME_NO_EXTRACTIONS	= "O jogo selecionado não tem extrações disponíveis!";
	public static final String MSG_UI_GENERIC_GAME_NO_PROCESSES		= "O jogo selecionado não tem processos disponíveis!";
	public static final String MSG_UI_GENERIC_GAME_INVALID			= "O jogo selecionado não é válido!";
	public static final String MSG_UI_GENERIC_CONSTEST_INVALID		= "O sorteio indicado não existe para o jogo selecionado!";
	public static final String MSG_UI_GENERIC_DRAW_INVALID			= "O concurso indicado não existe para o jogo selecionado!";
	public static final String MSG_UI_GENERIC_EXTRACTION_INVALID	= "A extração indicada não existe para o jogo selecionado!";

	public static final String MSG_UI_SEQUENCE_ERROR				= "Não foi possível obter o resultado da sequência desejada.";
	
	public static final String MSG_UI_GENERIC_EXPORT_SUCCESS		= "Ficheiro criado com successo.";
	public static final String MSG_UI_GENERIC_EXPORT_ERROR			= "Não foi possível criar o ficheiro.";
	public static final String MSG_UI_GENERIC_FILE_PROCESS_ERROR	= "Não foi possível processar o ficheiro.";
	public static final String MSG_UI_GENERIC_FILE_PROCESS_SUCCESS	= "O ficheiro foi processado com sucesso.";
	
	
	public String getMSG_UI_NO_AUTENTICATION() { return MSG_UI_GENERIC_NO_AUTENTICATION; }
	public String getMSG_UI_GENERIC_ERROR_MSG() { return MSG_UI_GENERIC_ERROR_MSG; }
	public String getMSG_UI_NO_PERMISSON_ERROR_MSG() { return MSG_UI_NO_PERMISSON_ERROR_MSG; }
	
	public String getMSG_UI_GENERIC_NO_RESULTS() { return MSG_UI_GENERIC_NO_RESULTS; }
	public String getMSG_UI_GENERIC_NO_RESEARCH_DATA() { return MSG_UI_GENERIC_NO_RESEARCH_DATA; }
	public String getMSG_UI_GENERIC_NO_CRITERIA() { return MSG_UI_GENERIC_NO_CRITERIA; }
	public String getMSG_UI_GENERIC_CANT_PROC_CRIT() { return MSG_UI_GENERIC_CANT_PROC_CRIT; }
	
	public String getMSG_UI_GENERIC_UPDATE_SUCCESS() { return MSG_UI_GENERIC_UPDATE_SUCCESS; }
	public String getMSG_UI_GENERIC_NO_UPDATE_INPUT() { return MSG_UI_GENERIC_NO_UPDATE_INPUT; }
	public String getMSG_UI_GENERIC_NO_UPDATES_CRITERIA() { return MSG_UI_GENERIC_NO_UPDATES_CRITERIA; }
	
	public String getMSG_UI_GENERIC_NO_GAMES() { return MSG_UI_GENERIC_NO_GAMES; }
	public String getMSG_UI_GENERIC_GAME_NO_CONTESTS() { return MSG_UI_GENERIC_GAME_NO_CONTESTS; }
	public String getMSG_UI_GENERIC_GAME_NO_DRAWS() { return MSG_UI_GENERIC_GAME_NO_DRAWS; }
	public String getMSG_UI_GENERIC_GAME_NO_EXTRACTIONS() { return MSG_UI_GENERIC_GAME_NO_EXTRACTIONS; }
	public String getMSG_UI_GENERIC_GAME_NO_PROCESSES() { return MSG_UI_GENERIC_GAME_NO_PROCESSES; }
	public String getMSG_UI_GENERIC_GAME_INVALID() { return MSG_UI_GENERIC_GAME_INVALID; }
	public String getMSG_UI_GENERIC_CONSTEST_INVALID() { return MSG_UI_GENERIC_CONSTEST_INVALID; }
	public String getMSG_UI_GENERIC_DRAW_INVALID() { return MSG_UI_GENERIC_DRAW_INVALID; }
	public String getMSG_UI_GENERIC_EXTRACTION_INVALID() { return MSG_UI_GENERIC_EXTRACTION_INVALID; }
	
	public String getMSG_UI_SEQUENCE_ERROR() { return MSG_UI_SEQUENCE_ERROR; }

	public String getMSG_UI_GENERIC_EXPORT_SUCCESS() { return MSG_UI_GENERIC_EXPORT_SUCCESS; }
	public String getMSG_UI_GENERIC_EXPORT_ERROR() { return MSG_UI_GENERIC_EXPORT_ERROR; }

	
	/*
	 *  Images types 
	 */
	
	public static final String MSG_TYPE_SUCCESS		= "sucesso";
	public static final String MSG_TYPE_WARNING		= "alerta";
	public static final String MSG_TYPE_ERROR		= "erro";

	public String getMSG_TYPE_SUCCESS() { return MSG_TYPE_SUCCESS; }
	public String getMSG_TYPE_WARNING() { return MSG_TYPE_WARNING; }
	public String getMSG_TYPE_ERROR() { return MSG_TYPE_ERROR; }


	/*
	 * WEEK DAYS 
	 */
	
	public static final String DOM = "Domingo";
	public static final String SEG = "Segunda-Feira";
	public static final String TER = "Terça-Feira";
	public static final String QUA = "Quarta-Feira";
	public static final String QUI = "Quinta-Feira";
	public static final String SEX = "Sexta-Feira";
	public static final String SAB = "Sábado";

	public String getDOM() { return DOM; }
	public String getSEG() { return SEG; }
	public String getTER() { return TER; }
	public String getQUA() { return QUA; }
	public String getQUI() { return QUI; }
	public String getSEX() { return SEX; }
	public String getSAB() { return SAB; }

	
	// In case LANG is ENG
	public String getSUN() { return DOM; }
	public String getMON() { return SEG; }
	public String getTUE() { return TER; }
	public String getWED() { return QUA; }
	public String getTHU() { return QUI; }
	public String getFRI() { return SEX; }
	public String getSAT() { return SAB; }
	
	public static String DAY(String day) {
		
		String result;
		
		switch (day) {
		case "DOM":
		case "SUN":
			result = GboConstants.DOM;
			break;
		
		case "SEG":
		case "MON":
			result = GboConstants.SEG;
			break;
		
		case "TER":
		case "TUE":
			result = GboConstants.TER;
			break;
		
		case "QUA":
		case "WED":
			result = GboConstants.QUA;
			break;
		
		case "QUI":
		case "THU":
			result = GboConstants.QUI;
			break;
		
		case "SEX":
		case "FRI":
			result = GboConstants.SEX;
			break;
		
		case "SAB":
		case "SAT":
			result = GboConstants.SAB;
			break;

		default:
			result = null;
			break;
		}
		
		return result;
	}
	
	
	public static final String SEG_SHORT = "2.ª feira";
	public static final String TER_SHORT = "3.ª feira";
	public static final String QUA_SHORT = "4.ª feira";
	public static final String QUI_SHORT = "5.ª feira";
	public static final String SEX_SHORT = "6.ª feira";
	
	public static String SHORT_DAY(String day) {
		
		String result;
		
		switch (day) {
		case "1":
			result = DOM;
			break;
			
		case "2":
			result = SEG_SHORT;
			break;
		
		case "3":
			result = TER_SHORT;
			break;
			
		case "4":
			result = QUA_SHORT;
			break;
			
		case "5":
			result = QUI_SHORT;
			break;
			
		case "6":
			result = SEX_SHORT;
			break;
			
		case "7":
			result = SAB;
			break;
			
		default:
			result = null;
			break;
		}
		
		return result;
	}

	/* 
	 * Generic REGEXs patterns 
	 */
	
	public static final String REGEX_NUMBERS				= "^[0-9]*$";
	public static final String REGEX_PRICE					= "^[0-9]*(\\.[0-9]{1,2})?$";
	public static final String REGEX_PRICE_VALUE			= "^([0-9]{1,3})((([0-9]){3}){0,2}|(\\.([0-9]){3}){0,2})(,[0-9]{2})?(\\ ?€)?$";
	public static final String REGEX_NUMBER_QUANTITY		= "^([0-9]{1,3})((([0-9]){3}){0,2}|(\\.([0-9]){3}){0,2})?$"; //   ###.###.### or #########
	public static final String REGEX_NUMBER_QUANTITY_10		= "^([0-9]{1,3})((([0-9]){3}){0,3}|(\\.([0-9]){3}){0,3})?$"; // #.###.###.### or ##########
	public static final String REGEX_RAFFLE_CODE_CMIL		= "^([Pp][BCDFGHJKLMNPQRSTVWXZbcdfghjklmnpqrstvwxz]{3})(\\d{5})$";
	public static final String REGEX_ALL_RAFFLE_CODE_CMIL	= "^([BbHhJjMmTtVvXxZzFfIiPpEeRrLlAaOoWwNnSs][BCDFGHJKLMNPQRSTVWXZbcdfghjklmnpqrstvwxz]{3})(\\d{5})$";
	public static final String REGEX_RAFFLE_CODE_M1L		= "^([BCDFGHJKLMNPQRSTVWXZbcdfghjklmnpqrstvwxz]{3})(\\d{5})$";
	public static final String REGEX_PASS_LENGTH			= "^(.){8,16}$";
	public static final String REGEX_PASS_LETTERS			= "^[a-zA-Z]$";
	public static final String REGEX_PASS_SIMBOLS			= "^[\\!\\$\\%\\?\\_\\.\\=\\-]$";
	public static final String REGEX_IP_FORMAT				= "^\\b(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b$";
	
	public String getREGEX_NUMBERS() { return REGEX_NUMBERS; }
	public String getREGEX_PRICE() { return REGEX_PRICE; }
	public String getREGEX_PRICE_VALUE() { return REGEX_PRICE_VALUE; }
	public String getREGEX_NUMBER_QUANTITY() { return REGEX_NUMBER_QUANTITY; }
	public String getREGEX_NUMBER_QUANTITY_10() { return REGEX_NUMBER_QUANTITY_10; }
	public String getREGEX_RAFFLE_CODE_CMIL() { return REGEX_RAFFLE_CODE_CMIL; }
	public String getREGEX_ALL_RAFFLE_CODE_CMIL() { return REGEX_ALL_RAFFLE_CODE_CMIL; }
	public String getREGEX_RAFFLE_CODE_M1L() { return REGEX_RAFFLE_CODE_M1L; }
	public String getREGEX_PASS_LENGTH() { return REGEX_PASS_LENGTH; }
	public String getREGEX_PASS_LETTERS() { return REGEX_PASS_LETTERS; }
	public String getREGEX_PASS_SIMBOLS() { return REGEX_PASS_SIMBOLS; }
	public String getREGEX_IP_FORMAT() { return REGEX_IP_FORMAT; }
	
	/*
	 * Columns and inputs maximum size 
	 */
	
	public static final Integer MAX_SIZE_PRICE_VALUE 		= 16;
	public static final Integer MAX_SIZE_NUMBER_WINNERS		= 10;
	
	public Integer getMAX_SIZE_PRICE_VALUE() { return MAX_SIZE_PRICE_VALUE; }
	public Integer getMAX_SIZE_NUMBER_WINNERS() { return MAX_SIZE_NUMBER_WINNERS; }
	
	/*
	 * Generic TOOLTIP messages
	 */
	public static final String TOOLTIP_WDETAIL				= "Formato do campo: <br> ###-########-###";
	public static final String TOOLTIP_TERMINAL				= "Formato do campo: <br> #######";
	public static final String TOOLTIP_PRICE				= "Formato do campo: <br> ###.###.###,## ou #########,## <br> com ou sem €";
	public static final String TOOLTIP_INTEGER_9			= "Formato do campo: <br> ###.###.### ou #########";
	public static final String TOOLTIP_INTEGER_10			= "Formato do campo: <br> #.###.###.### ou ##########";
	public static final String TOOLTIP_DIGITS				= "Dígitos.";
	public static final String TOOLTIP_DATE					= "Formato da data: DD/MM/AAAA";
	public static final String TOOLTIP_HOUR					= "Formato da hora: HH:MM:SS";
	public static final String TOOLTIP_DATE_HOUR			= "Formato da data:<br> DD/MM/AAAA HH:MM:SS";
	public static final String TOOLTIP_PERIOD_IN_MINUTES	= "Período em minutos.";
	public static final String TOOLTIP_PASSWORD 			= "A password tem de ser composta por 8 a 16 caracteres de 2 tipos diferentes (Letras sem acentos, números e/ou ! $ % ? = - . _ ).";
	public static final String TOOLTIP_CMIL_RAFFLE_CODE		= "Código alfanumérico, segundo os requisitos, no formato: PLLLNNNNN";
	public static final String TOOLTIP_MILHAO_RAFFLE_CODE	= "Código alfanumérico, segundo os requisitos, no formato: LLLNNNNN";

	public String getTOOLTIP_WDETAIL() { return TOOLTIP_WDETAIL; }
	public String getTOOLTIP_TERMINAL() { return TOOLTIP_TERMINAL; }
	public String getTOOLTIP_PRICE() { return TOOLTIP_PRICE; }
	public String getTOOLTIP_INTEGER_9() { return TOOLTIP_INTEGER_9; }
	public String getTOOLTIP_INTEGER_10() { return TOOLTIP_INTEGER_10; }
	public String getTOOLTIP_DIGITS() { return TOOLTIP_DIGITS; }
	public String getTOOLTIP_DATE() { return TOOLTIP_DATE; }
	public String getTOOLTIP_HOUR() { return TOOLTIP_HOUR; }
	public String getTOOLTIP_DATE_HOUR() { return TOOLTIP_DATE_HOUR; }
	public String getTOOLTIP_PERIOD_IN_MINUTES() { return TOOLTIP_PERIOD_IN_MINUTES; }
	public String getTOOLTIP_PASSWORD() {return TOOLTIP_PASSWORD;}
	public String getTOOLTIP_CMIL_RAFFLE_CODE() { return TOOLTIP_CMIL_RAFFLE_CODE; }
	public String getTOOLTIP_MILHAO_RAFFLE_CODE() { return TOOLTIP_MILHAO_RAFFLE_CODE; }
	
	
	/*
	 * Generic PLACEHOLDER messages
	 */
	
	public static final String PLACEHOLDER_STATION_CODE			= "N.º de Máquina";
	public static final String PLACEHOLDER_WDETAIL				= "N.º de Série";
	
	public static final String PLACEHOLDER_WAGER_DATE			= "Data de Transação";
	public static final String PLACEHOLDER_CURRENT_DATE			= "Data do Dia";
	public static final String PLACEHOLDER_WAGER_INITIAL_HOUR	= "Hora de Início";
	public static final String PLACEHOLDER_WAGER_FINAL_HOUR		= "Hora de Fim";
	
	public String getPLACEHOLDER_STATION_CODE() { return PLACEHOLDER_STATION_CODE; }
	public String getPLACEHOLDER_WDETAIL() { return PLACEHOLDER_WDETAIL; }
	public String getPLACEHOLDER_WAGER_DATE() { return PLACEHOLDER_WAGER_DATE; }
	public String getPLACEHOLDER_CURRENT_DATE() { return PLACEHOLDER_CURRENT_DATE; }
	public String getPLACEHOLDER_WAGER_INITIAL_HOUR() { return PLACEHOLDER_WAGER_INITIAL_HOUR; }
	public String getPLACEHOLDER_WAGER_FINAL_HOUR() { return PLACEHOLDER_WAGER_FINAL_HOUR; }
	
	
	
	/*
	 * Number formats
	 */
	
	public static final String NUMBER_FORMAT_INTEGER	= "###,##0";
	public static final String NUMBER_FORMAT_DECIMAL	= "###,##0.00";
	public static final String NUMBER_FORMAT_CURRENCY	= "###,##0.00 €";
	public static final BigDecimal PRICE_MAX_VALUE		= new BigDecimal(999999999.99);
	public static final BigDecimal PRICE_MIN_VALUE		= new BigDecimal(0);
	

	public String getNUMBER_FORMAT_INTEGER() { return NUMBER_FORMAT_INTEGER; }
	public String getNUMBER_FORMAT_DECIMAL() { return NUMBER_FORMAT_DECIMAL; }
	public String getNUMBER_FORMAT_CURRENCY() { return NUMBER_FORMAT_CURRENCY; }
	public BigDecimal getPRICE_MAX_VALUE() { return PRICE_MAX_VALUE; }
	public BigDecimal getPRICE_MIN_VALUE() { return PRICE_MIN_VALUE; }
	
	
	/*
	 * Empty values
	 */
	
	public static final String EMPTY_VALUE		= "- - -";
	public static final String EMPTY_DATE		= "- -/- -/- - - -";
	public static final String EMPTY_DATE_HOUR	= "--/--/---- --:--:--";
	public static final String EMPTY_HOUR		= "- -:- -:- -";
	public static final String NOT_APPLICABLE	= "N/A";

	public String getEMPTY_VALUE() { return EMPTY_VALUE; }
	public String getEMPTY_DATE() { return EMPTY_DATE; }
	public String getEMPTY_DATE_HOUR() { return EMPTY_DATE_HOUR; }
	public String getEMPTY_HOUR() { return EMPTY_HOUR; }
	public String getNOT_APPLICABLE() { return NOT_APPLICABLE; }
	
	
	/*
	 * Control Process Messages 
	 */
	
	public static final String MODULE_STILL_RUNNING			= "O módulo continua a correr! Verifique o log do módulo para mais detalhes.";
	public static final String MODULE_STOP_W_ERROR			= "O módulo terminou com erros! Verifique o log do módulo para mais detalhes.";
	public static final String MODULE_EXECUTION_FAILURE		= "A execução do módulo falhou!";
	public static final String MODULE_OTHER_RUNNING			= "O módulo já se encontra em execução!";
	
	public String getMODULE_STILL_RUNNING() { return MODULE_STILL_RUNNING; }
	public String getMODULE_STOP_W_ERROR() { return MODULE_STOP_W_ERROR; }
	public String getMODULE_EXECUTION_FAILURE() { return MODULE_EXECUTION_FAILURE; }

	/*
	 * Operation Types
	 */
	
	public static final String OPERATIONS_PORTAL_HOME		= "portal_home";
	public static final String OPERATIONS_FUNCTIONALITIES	= "functionalities";
	public static final String OPERATIONS_LANDING			= "landing";

	public static final String SENSITIVE_DATA_FIELD			= "sensitive_data_field";
	public static final String SENSITIVE_DATA_VIRN			= "sensitive_virn";
	public static final String SENSITIVE_DATA_IBAN			= "sensitive_iban";
	public static final String SENSITIVE_DATA_NIF			= "sensitive_nif";
	
	public static final String SENSITIVE_DATA_INFO			= "sensitive_data_info";
	public static final String SENSITIVE_DATA_PRIZE			= "sensitive_prize";
	public static final String SENSITIVE_STATIONS			= "sensitive_stations";
	
	public static final String STABLISHMENT_SEARCH			= "stablishment_search";
	public static final String AGENT_SEARCH					= "agent_search";
	public static final String WAGER_CANCEL_EDITION			= "wager_cancel_edition";
	public static final String PAYMENT_EDITION				= "payment_edition";
	public static final String EXCEPTIONAL_CANCEL_EDITION	= "exceptional_cancel_edition";
	
	public static final String GAME_CREATION_PERMITION		= "game_creation_permition";
	public static final String CONTEST_CREATION_PERMITION	= "contest_creation_permition";
	public static final String CONTEST_GENERATION_PERMITION	= "contest_generation_permition";
	
	public static final String PRESS_DOWNLOAD_MNG			= "download_management";
	public static final String PRESS_UPLOAD_MNG				= "upload_management";
	
	public String getOPERATIONS_PORTAL_HOME() { return OPERATIONS_PORTAL_HOME; }
	public String getOPERATIONS_FUNCTIONALITIES() { return OPERATIONS_FUNCTIONALITIES; }
	public String getOPERATIONS_LANDING() { return OPERATIONS_LANDING; }
	
	public String getSENSITIVE_DATA_FIELD() { return SENSITIVE_DATA_VIRN; }
	public String getSENSITIVE_DATA_VIRN() { return SENSITIVE_DATA_VIRN; }
	public String getSENSITIVE_DATA_IBAN() { return SENSITIVE_DATA_IBAN; }
	public String getSENSITIVE_DATA_NIF() { return SENSITIVE_DATA_NIF; }
	
	public String getSENSITIVE_DATA_INFO() { return SENSITIVE_DATA_VIRN; }
	public String getSENSITIVE_DATA_PRIZE() { return SENSITIVE_DATA_PRIZE; }
	public String getSENSITIVE_STATION() { return SENSITIVE_STATIONS; }
	
	public String getSTABLISHMENT_SEARCH() { return STABLISHMENT_SEARCH; }
	public String getAGENT_SEARCH() { return AGENT_SEARCH; }
	public String getWAGER_CANCEL_EDITION() { return WAGER_CANCEL_EDITION; }
	public String getPAYMENT_EDITION() { return PAYMENT_EDITION; }
	public String getEXCEPTIONAL_CANCEL_EDITION() { return EXCEPTIONAL_CANCEL_EDITION; }
	
	public String getGAME_CREATION_PERMITION() { return GAME_CREATION_PERMITION; }
	public String getCONTEST_CREATION_PERMITION() { return CONTEST_CREATION_PERMITION; }
	public String getCONTEST_GENERATION_PERMITION() { return CONTEST_GENERATION_PERMITION; }
	
	public String getPRESS_DOWNLOAD_MNG() { return PRESS_DOWNLOAD_MNG; }
	public String getPRESS_UPLOAD_MNG() { return PRESS_UPLOAD_MNG; }
	
	/*
	 * Export Types
	 */
	public static final String EXPORT_PDF			= "p";
	public static final String EXPORT_EXCEL			= "e";
	public static final String EXPORT_WORD			= "w";
	
	public static final String EXCEL_FILE_FORMAT 	= "Excel";
	public static final String EXCEL_FILE_EXTENSION = ".xlsx";
	public static final String PDF_FILE_FORMAT 		= "PDF";
	public static final String PDF_FILE_EXTENSION 	= ".pdf";
	public static final String WORD_FILE_FORMAT 	= "Word";
	public static final String WORD_FILE_EXTENSION 	= ".docx";
	
	
	public String getEXPORT_PDF() { return EXPORT_PDF; }
	public String getEXPORT_EXCEL() { return EXPORT_EXCEL; }
	public String getEXPORT_WORD() { return EXPORT_WORD; }
	
	public static String getEXCEL_FILE_FORMAT() {return EXCEL_FILE_FORMAT; }
	public static String getEXCEL_FILE_EXTENSION() {return EXCEL_FILE_EXTENSION; }
	public static String getPDF_FILE_FORMAT() {return PDF_FILE_FORMAT; }
	public static String getPDF_FILE_EXTENSION() {return PDF_FILE_EXTENSION; }
	public static String getWORD_FILE_FORMAT() {return WORD_FILE_FORMAT; }
	public static String getWORD_FILE_EXTENSION() {return WORD_FILE_EXTENSION; } 
	
	/**
	 * {@link Enum} with the file type options to be exported.
	 * 
	 * <dl>
	 * <dt>Eligible File Types:</dt>
	 * <dd>EXCEL</dd>
	 * <dd>PDF</dd>
	 * <dd>WORD</dd>
	 * </dl>
	 * @author Accenture
	 */
	public static enum FileTypes {
		EXCEL, PDF, WORD
	}
	
	
	
	
	/*
	 * Batch Modules Execution Status
	 */
	public static final String BATCH_RUNNING			= "X";
	public static final String BATCH_RUNNING_MSG		= "Em execução";
	
	public static final String BATCH_ERROR				= "E";
	public static final String BATCH_ERROR_MSG			= "Erro";
	
	public static final String BATCH_SUCCESS			= "S";
	public static final String BATCH_SUCCESS_MSG		= "Sucesso";
	
	public static final String BATCH_HOLD_MSG			= "Aguarda Execução";
	
	public static final String BATCH_BO_LAUNCH			= "B";
	
	public String getBATCH_RUNNING() { return BATCH_RUNNING; }
	public String getBATCH_RUNNING_MSG() { return BATCH_RUNNING_MSG; }
	
	public String getBATCH_ERROR() { return BATCH_ERROR; }
	public String getBATCH_ERROR_MSG() { return BATCH_ERROR_MSG; }
	
	public String getBATCH_SUCCESS() { return BATCH_SUCCESS; }
	public String getBATCH_SUCCESS_MSG() { return BATCH_SUCCESS_MSG; }
	
	public String getBATCH_HOLD_MSG() { return BATCH_HOLD_MSG; }
	
	public static final String BATCH_EXECUTION_FAIL_MSG		= "Erro ao executar o módulo batch!";
	
	public String getBATCH_EXECUTION_FAIL_MSG() { return BATCH_EXECUTION_FAIL_MSG; }
	
	
	/* GENERIC MODEL AND VIEW PROPERTIES */
	public static final String MODAL_HIDDEN_CLASS = "hidden";
	public String getMODAL_HIDDEN_CLASS() { return MODAL_HIDDEN_CLASS; }
	
	
	
	
	
	
}
