package com.journaldev.spring.constants;

import com.journaldev.spring.constants.GboConstants;

public class Constants extends GboConstants {

	public static final String	MSG_YES	= "Sim";
	public static final String	MSG_NO	= "Não";

	public String getMSG_YES() {
		return MSG_YES;
	}

	public String getMSG_NO() {
		return MSG_NO;
	}

	public static final String MSG_LOGISTIC_REG_SERIES_UNSENT = "Séries regulares por enviar!";

	public String getMSG_LOGISTIC_REG_SERIES_UNSENT() {
		return MSG_LOGISTIC_REG_SERIES_UNSENT;
	}

	public static final String	MSG_UI_PASSIVELOTERY_EXTRACTION_INVALID		= "A extração indicada não existe para o jogo selecionado!";
	public static final String	MSG_UI_CONTINGENT_PAGE_ADDITION_INVALID		= "A adição de páginas não é possivel com o estabelecimento selecionado!";
	public static final String	MSG_UI_CONTINGENT_ESTABLISHMENT_NO_PAGES	= "Não foram devolvidas páginas para o estabelecimento selecionado!";
	public static final String	MSG_UI_LOGISTIC_SUCCESS						= "O pedido de envio foi realizado com sucesso.";
	public static final String	MSG_UI_LOGISTIC_ERROR						= "Não foi possível realizar o pedido de envio.";
	public static final String	MSG_UI_PASSIVELOTERY_EXTRACTION_DR_INVALID	= "Não foi possível submeter os Números da Extração!";
	public static final String	MSG_UI_BATCH_NO_INFO						= "Não foi possível obter a informação sobre o batch!";

	public String getMSG_UI_BATCH_NO_INFO() {
		return MSG_UI_BATCH_NO_INFO;
	}

	public static final String	FORMAT_DATE				= "DD/MM/YYYY";
	public static final String	FORMAT_DATE_HOUR		= "DD/MM/YYYY HH:mm:ss";
	public static final String	JAVA_FORMAT_DATE		= "dd/MM/yyyy";
	public static final String	JAVA_FORMAT_DATE_HOUR	= "dd/MM/yyyy HH:mm:ss";
	public static final String	JAVA_FORMAT_HOUR		= "HH:mm:ss";

	public String getFORMAT_DATE() {
		return FORMAT_DATE;
	}

	public String getFORMAT_DATE_HOUR() {
		return FORMAT_DATE_HOUR;
	}

	public String getJAVA_FORMAT_DATE_HOUR() {
		return JAVA_FORMAT_DATE_HOUR;
	}

	public String getJAVA_FORMAT_DATE() {
		return JAVA_FORMAT_DATE;
	}

	public String getJAVA_FORMAT_HOUR() {
		return JAVA_FORMAT_HOUR;
	}

	public static final String	PASSING_DATA_NOT	= "NOT";
	public static final String	PASSING_DATA_EMPTY	= "EMPTY";
	public static final String	PASSING_DATA_FILLED	= "FILLED";

	public String getPASSING_DATA_NOT() {
		return PASSING_DATA_NOT;
	}

	public String getPASSING_DATA_EMPTY() {
		return PASSING_DATA_EMPTY;
	}

	public String getPASSING_DATA_FILLED() {
		return PASSING_DATA_FILLED;
	}

	/******************************************************************************************************************************
	 * 
	 * EXTRACTION IMAGE KEYS
	 * 
	 ******************************************************************************************************************************/
	public static final String MSG_UI_PASSIVELOTERY_IMAGE_DIR_INVALID = "A directoria de destino da imagem da extração é inválida!";

	public static final String	KEY_IMAGE_FTP_PREFIX	= "frac";
	public static final String	KEY_IMAGE_TYPE			= "imageType";
	public static final String	KEY_IMAGE_TYPE_FRONT	= "front";
	public static final String	KEY_IMAGE_TYPE_BACK		= "back";
	public static final String	KEY_IMAGE_GIF			= ".gif";

	public String getKEY_IMAGE_FTP_PREFIX() {
		return KEY_IMAGE_FTP_PREFIX;
	}

	public String getKEY_IMAGE_TYPE() {
		return KEY_IMAGE_TYPE;
	}

	public String getKEY_IMAGE_TYPE_FRONT() {
		return KEY_IMAGE_TYPE_FRONT;
	}

	public String getKEY_IMAGE_TYPE_BACK() {
		return KEY_IMAGE_TYPE_BACK;
	}

	public String getKEY_IMAGE_GIF() {
		return KEY_IMAGE_GIF;
	}

	/******************************************************************************************************************************
	 * 
	 * EXTRACTION REPORTS KEYS
	 * 
	 ******************************************************************************************************************************/
	public static final String MSG_UI_PASSIVELOTERY_REPORT_DIR_INVALID = "A directoria de destino do relatório da extração é inválida!";

	public static final String	KEY_DISTRIBUTION_REPORT				= "distributionReport";
	public static final String	KEY_DISTRIBUTION_COM_REPORT_INI		= "comIni";
	public static final String	KEY_DISTRIBUTION_COM_REPORT_END		= "comEnd";
	public static final String	KEY_DISTRIBUTION_DIRA_REPORT_END	= "diraEnd";
	public static final String	KEY_DISTRIBUTION_REPORT_EXCEL		= ".xlsx";

	public String getKEY_DISTRIBUTION_REPORT() {
		return KEY_DISTRIBUTION_REPORT;
	}

	public String getKEY_DISTRIBUTION_COM_REPORT_INI() {
		return KEY_DISTRIBUTION_COM_REPORT_INI;
	}

	public String getKEY_DISTRIBUTION_COM_REPORT_END() {
		return KEY_DISTRIBUTION_COM_REPORT_END;
	}

	public String getKEY_DISTRIBUTION_DIRA_REPORT_END() {
		return KEY_DISTRIBUTION_DIRA_REPORT_END;
	}

	public String getKEY_DISTRIBUTION_REPORT_EXCEL() {
		return KEY_DISTRIBUTION_REPORT_EXCEL;
	}

	/******************************************************************************************************************************
	 * 
	 * SFTP CLIENT KEYS
	 * 
	 ******************************************************************************************************************************/
	public static final String KEY_SFTP_ACTION_COPY = "SFTPCOPY";
	public static final String KEY_SFTP_ACTION_REMOVE = "SFTPRM";

	public String getKEY_SFTP_ACTION_COPY() {
		return KEY_SFTP_ACTION_COPY;
	}
	
	public String getKEY_SFTP_ACTION_REMOVE() {
		return KEY_SFTP_ACTION_REMOVE;
	}

	/******************************************************************************************************************************
	 * 
	 * FTP CLIENT KEYS
	 * 
	 ******************************************************************************************************************************/
	public static final String	KEY_FTP_ACTION_COPY		= "COPY";
	public static final String	KEY_FTP_ACTION_LIST		= "LIST";
	public static final String	KEY_FTP_ACTION_DELETE	= "DELETE";

	public String getKEY_FTP_ACTION_COPY() {
		return KEY_FTP_ACTION_COPY;
	}

	/******************************************************************************************************************************
	 * 
	 * HTTP CLIENT KEYS
	 * 
	 ******************************************************************************************************************************/
	public static final String	KEY_HTTP_CLIENT_GET		= "GET";
	public static final String	KEY_HTTP_CLIENT_POST	= "POST";
	public static final String	KEY_HTTP_CLIENT_PUT		= "PUT";
	public static final String	KEY_HTTP_CLIENT_DELETE	= "DELETE";

	public static final String	KEY_HTTP_ENTITY		= "ENTITY";
	public static final String	KEY_HTTP_PAGE		= "page";
	public static final String	KEY_HTTP_PAGE_SIZE	= "size";
	public static final String	KEY_HTTP_SORT		= "sort";
	public static final String	KEY_HTTP_SORT_TYPE	= "sortType";

	public String getKEY_HTTP_CLIENT_GET() {
		return KEY_HTTP_CLIENT_GET;
	}

	public String getKEY_HTTP_CLIENT_POST() {
		return KEY_HTTP_CLIENT_POST;
	}

	public String getKEY_HTTP_CLIENT_PUT() {
		return KEY_HTTP_CLIENT_PUT;
	}

	public String getKEY_HTTP_CLIENT_DELETE() {
		return KEY_HTTP_CLIENT_DELETE;
	}

	public String getKEY_HTTP_ENTITY() {
		return KEY_HTTP_ENTITY;
	}

	public String getKEY_HTTP_PAGE() {
		return KEY_HTTP_PAGE;
	}

	public String geKEY_HTTP_PAGE_SIZE() {
		return KEY_HTTP_PAGE_SIZE;
	}

	public String getKEY_HTTP_SORT() {
		return KEY_HTTP_SORT;
	}

	public String getKEY_HTTP_SORT_TYPE() {
		return KEY_HTTP_SORT_TYPE;
	}

	/******************************************************************************************************************************
	 * 
	 * CONTINGENT
	 * 
	 ******************************************************************************************************************************/
	public static final String	REG_CONTINGENT_ESTABLISHMENT	= "^\\d{6}_\\d{2}$";
	public static final String	REG_CONTINGENT_TERMINAL			= "^\\d{7}$";
	public static final String	REG_CONTINGENT_RETAILER			= "^\\d{6}";
	public static final String	REG_CONTINGENT_TICKET_NR_T		= "^\\d{5}$";
	public static final String	REG_CONTINGENT_TICKET_NR_S		= "^\\d{2}$";
	public static final String	REG_CONTINGENT_TICKET_NR_F		= "^\\d{2}$";

	public String getREG_CONTINGENT_ESTABLISHMENT() {
		return REG_CONTINGENT_ESTABLISHMENT;
	}

	public String getREG_CONTINGENT_TERMINAL() {
		return REG_CONTINGENT_TERMINAL;
	}

	public String getREG_CONTINGENT_RETAILER() {
		return REG_CONTINGENT_RETAILER;
	}

	public String getREG_CONTINGENT_TICKET_NR_T() {
		return REG_CONTINGENT_TICKET_NR_T;
	}

	public String getREG_CONTINGENT_TICKET_NR_S() {
		return REG_CONTINGENT_TICKET_NR_S;
	}

	public String getREG_CONTINGENT_TICKET_NR_F() {
		return REG_CONTINGENT_TICKET_NR_F;
	}

	public static final String	TOOLTIP_CONTINGENT_ESTABLISHMENT	= "Insira o código do Estabelecimento. (######_##)";
	public static final String	TOOLTIP_CONTINGENT_TERMINAL			= "Insira o código do Terminal. (#######)";
	public static final String	TOOLTIP_CONTINGENT_RETAILER			= "Insira o código do Mediador (######).";
	public static final String	TOOLTIP_CONTINGENT_TICKET_NR		= "Insira o n&uacute;mero de bilhete no formato ##### ou ##### ## ##";

	public String getTOOLTIP_CONTINGENT_ESTABLISHMENT() {
		return TOOLTIP_CONTINGENT_ESTABLISHMENT;
	}

	public String getTOOLTIP_CONTINGENT_TERMINAL() {
		return TOOLTIP_CONTINGENT_TERMINAL;
	}

	public String getTOOLTIP_CONTINGENT_RETAILER() {
		return TOOLTIP_CONTINGENT_RETAILER;
	}

	public String getTOOLTIP_CONTINGENT_TICKET_NR() {
		return TOOLTIP_CONTINGENT_TICKET_NR;
	}

	public static final String	KEY_CONTINGENT_SHEET_TYPE				= "sheetType";
	public static final String	KEY_CONTINGENT_ENTITY_TYPE				= "entityType";
	public static final String	KEY_CONTINGENT_ENTITY_VALUE				= "entityValue";
	public static final String	KEY_CONTINGENT_ESTABLISHMENT_CODE		= "establishmentCode";
	public static final String	KEY_CONTINGENT_ESTABLISHMENT_ID			= "establishmentId";
	public static final String	KEY_CONTINGENT_RETAIL_CODE				= "retailCode";
	public static final String	KEY_CONTINGENT_RETAIL_ID				= "retailId";
	public static final String	KEY_CONTINGENT_PAGE_QUANTITY			= "pageQuantity";
	public static final String	KEY_CONTINGENT_REQUEST_TYPE_ID			= "requestTypeId";
	public static final String	KEY_CONTINGENT_CURRENT_ENTITY_TYPE_ID	= "currentEntityTypeId";
	public static final String	KEY_CONTINGENT_CURRENT_EXTRACTION_CODE	= "currentExtractionCode";
	public static final String	KEY_CONTINGENT_CURRENT_GAME_ID			= "currentGameId";
	public static final String	KEY_CONTINGENT_CURRENT_ENTITY_VALUE		= "currentEntityValue";
	public static final String	KEY_CONTINGENT_REQUEST_RETAIL_CODE		= "requestRetailCode";
	public static final String	KEY_CONTINGENT_EXTRACTION_ID			= "extractionId";
	public static final String	KEY_CONTINGENT_GAME_ID					= "gameId";
	public static final String	KEY_CONTINGENT_FIELD_OPERATION			= "fieldOperation";
	public static final String	KEY_CONTINGENT_REQUEST_ID				= "requestId";

	public static final String KEY_EXTRACTION_PAGE_QUANTITY = "quantityOfRequestedPages";

	public String getKEY_CONTINGENT_SHEET_TYPE() {
		return KEY_CONTINGENT_SHEET_TYPE;
	}

	public String getKEY_CONTINGENT_ENTITY_TYPE() {
		return KEY_CONTINGENT_ENTITY_TYPE;
	}

	public String getKEY_CONTINGENT_ESTABLISHMENT_CODE() {
		return KEY_CONTINGENT_ESTABLISHMENT_CODE;
	}

	public String getKEY_CONTINGENT_ESTABLISHMENT_ID() {
		return KEY_CONTINGENT_ESTABLISHMENT_ID;
	}

	public String getKEY_CONTINGENT_RETAIL_CODE() {
		return KEY_CONTINGENT_RETAIL_CODE;
	}

	public String getKEY_CONTINGENT_RETAIL_ID() {
		return KEY_CONTINGENT_RETAIL_ID;
	}

	/******************************************************************************************************************************
	 * 
	 * NUMERAÇÃO
	 * 
	 ******************************************************************************************************************************/
	public static final String	REG_NUMERATION_ESTABLISHMENT	= "^\\d{6}_\\d{2}$";
	public static final String	REG_NUMERATION_INTEGER			= "^([0-9]{1,3})((([0-9]){3}){0,2}|(\\.([0-9]){3}){0,2})?$";
	public static final String	REG_NUMERATION_NUMBER			= "^(((\\_){1,4})([0-9]{1,4}))|([0-9]{5})$";
	public static final String	REG_NUMERATION_PAGE				= "^([0-9]{15})$";

	public String getREG_NUMERATION_ESTABLISHMENT() {
		return REG_NUMERATION_ESTABLISHMENT;
	}

	public String getREG_NUMERATION_INTEGER() {
		return REG_NUMERATION_INTEGER;
	}

	public String getREG_NUMERATION_NUMBER() {
		return REG_NUMERATION_NUMBER;
	}

	public String getREG_NUMERATION_PAGE() {
		return REG_NUMERATION_PAGE;
	}

	public static final String	TOOLTIP_NUMERATION_ESTABLISHMENT	= "Insira o código do Estabelecimento. (######_##)";
	public static final String	TOOLTIP_NUMERATION_PAGINA			= "Insira o número de página no formato. <br> ###############";
	public static final String	TOOLTIP_NUMERATION_NUMBER			= "Insira o número no formato. <br> #####";
	public static final String	TOOLTIP_NUMERATION_FRACTION			= "Insira o número de frações no formato. <br> #";
	public static final String	TOOLTIP_NUMERATION_SERIES			= "Insira o número de séries no formato. <br> #";

	public String getTOOLTIP_NUMERATION_PAGINA() {
		return TOOLTIP_NUMERATION_PAGINA;
	}

	public String getTOOLTIP_NUMERATION_NUMBER() {
		return TOOLTIP_NUMERATION_NUMBER;
	}

	public String getTOOLTIP_NUMERATION_FRACTION() {
		return TOOLTIP_NUMERATION_FRACTION;
	}

	public String getTOOLTIP_NUMERATION_SERIES() {
		return TOOLTIP_NUMERATION_SERIES;
	}

	public String getTOOLTIP_NUMERATION_ESTABLISHMENT() {
		return TOOLTIP_NUMERATION_ESTABLISHMENT;
	}

	public static final String	KEY_EXTRACTION_NUMERATION_ENTITY_TYPE_ID	= "entityTypeId";
	public static final String	KEY_EXTRACTION_NUMERATION_ENTITY_VALUE		= "entityValue";
	public static final String	KEY_EXTRACTION_NUMERATION_SHEET_TYPE_ID		= "pageTypeId";

	public static final String KEY_EXTRACTION_NUMERATION_NUM_PAGES = "quantityOfRequestedPages";

	public static String getKEY_EXTRACTION_NUMERATION_ENTITY_TYPE_ID() {
		return KEY_EXTRACTION_NUMERATION_ENTITY_TYPE_ID;
	}

	public static String getKEY_EXTRACTION_NUMERATION_ENTITY_VALUE() {
		return KEY_EXTRACTION_NUMERATION_ENTITY_VALUE;
	}

	public static String getKEY_EXTRACTION_NUMERATION_SHEET_TYPE_ID() {
		return KEY_EXTRACTION_NUMERATION_SHEET_TYPE_ID;
	}

	/******************************************************************************************************************************
	 * 
	 * PRIZEPLANS HTTP PARAMETERS KEYS
	 * 
	 ******************************************************************************************************************************/
	public static final String	KEY_PRIZE_PLANS_ID				= "prizePlanId";
	public static final String	KEY_PRIZE_PLANS_CODE			= "prizePlanCode";
	public static final String	KEY_PRIZE_PLANS_EXTRACTION_ID	= "extractionTypeId";

	public static final String	KEY_PRIZE_PLANS_STATUS_ID	= "prizePlanStatusId";
	public static final String	KEY_PRIZE_PLANS_EMISSION_ID	= "emissionTypeId";

	public String getKEY_PRIZE_PLANS_ID() {
		return KEY_PRIZE_PLANS_ID;
	}

	public String getKEY_PRIZE_PLANS_CODE() {
		return KEY_PRIZE_PLANS_CODE;
	}

	public String getKEY_PRIZE_PLANS_EXTRACTION_ID() {
		return KEY_PRIZE_PLANS_EXTRACTION_ID;
	}

	public String getKEY_PRIZE_PLANS_STATUS_ID() {
		return KEY_PRIZE_PLANS_STATUS_ID;
	}

	public String getKEY_PRIZE_PLANS_EMISSION_ID() {
		return KEY_PRIZE_PLANS_EMISSION_ID;
	}

	/*
	 * PRIZEPLANS DEFAULT HTTP PARAMETERS KEYS
	 */
	public static final String	KEY_PRIZE_PLANS_VALUE_SIZE			= "25";
	public static final String	KEY_PRIZE_PLANS_VALUE_SIZE_HISTORY	= "1";
	public static final String	KEY_PRIZE_PLANS_VALUE_SORT_HISTORY	= "changeDate";
	public static final String	KEY_PRIZE_PLANS_VALUE_SORTTYPE_ASC	= "ASC";
	public static final String	KEY_PRIZE_PLANS_VALUE_SORTTYPE_DESC	= "DESC";

	public String getKEY_PRIZE_PLANS_VALUE_SIZE() {
		return KEY_PRIZE_PLANS_VALUE_SIZE;
	}

	public String getKEY_PRIZE_PLANS_VALUE_SIZE_HISTORY() {
		return KEY_PRIZE_PLANS_VALUE_SIZE_HISTORY;
	}

	public String getKEY_PRIZE_PLANS_VALUE_SORT_HISTORY() {
		return KEY_PRIZE_PLANS_VALUE_SORT_HISTORY;
	}

	public String getKEY_PRIZE_PLANS_VALUE_SORTTYPE_ASC() {
		return KEY_PRIZE_PLANS_VALUE_SORTTYPE_ASC;
	}

	public String getKEY_PRIZE_PLANS_VALUE_SORTTYPE_DESC() {
		return KEY_PRIZE_PLANS_VALUE_SORTTYPE_DESC;
	}

	/*
	 * ORDERS KEYS
	 * 
	 */
	public static final String KEY_ORDER_ID = "ordeId";

	public String getKEY_ORDER_ID() {
		return KEY_ORDER_ID;
	}

	/*
	 * Search Actions
	 */
	public static final String	SEARCH_ACTION_BACK	= "BACK";
	public static final String	SEARCH_ACTION_NEW	= "NEW";

	public String getSEARCH_ACTION_BACK() {
		return SEARCH_ACTION_BACK;
	}

	public String getSEARCH_ACTION_NEW() {
		return SEARCH_ACTION_NEW;
	}

	/*
	 * PRIZE PLAN TOOLTIP messages
	 */
	public static final String	TOOLTIP_PRIZE_PLAN_CODE		= "Insira o código do Plano de Prémios no formato (LN{d}*)";
	public static final String	TOOLTIP_PRIZE_PLAN_INTEGER	= "Formato do campo: <br> ###.###.### ou #########";
	public static final String	TOOLTIP_PRIZE_PLAN_CURRENCY	= "Formato do campo: <br> ###.###.###,## ou #########,## <br> com ou sem €";
	public static final String	TOOLTIP_PRIZE_PLAN_PERCENT	= "Formato do campo: <br> ###,## <br> com ou sem %";
	public static final String	TOOLTIP_SERIAL_NUMBER		= "Formato do campo: ######-##-##########-###";

	public String getTOOLTIP_PRIZE_PLAN_CODE() {
		return TOOLTIP_PRIZE_PLAN_CODE;
	}

	public String getTOOLTIP_PRIZE_PLAN_INTEGER() {
		return TOOLTIP_PRIZE_PLAN_INTEGER;
	}

	public String getTOOLTIP_PRIZE_PLAN_CURRENCY() {
		return TOOLTIP_PRIZE_PLAN_CURRENCY;
	}

	public String getTOOLTIP_PRIZE_PLAN_PERCENT() {
		return TOOLTIP_PRIZE_PLAN_PERCENT;
	}

	public String getTOOLTIP_SERIAL_NUMBER() {
		return TOOLTIP_SERIAL_NUMBER;
	}

	/*
	 * REGEX
	 */
	public static final String	REG_PRIZE_PLAN_CODE		= "^(LN){1}([0-9]+)$";
	public static final String	REG_PRIZE_PLAN_CURRENCY	= "^([0-9]{1,3})((([0-9]){3}){0,2}|(\\.([0-9]){3}){0,2})(,[0-9]{1,2})(\\ ?€)?$";
	public static final String	REG_PRIZE_PLAN_INTEGER	= "^([0-9]{1,3})((([0-9]){3}){0,2}|(\\.([0-9]){3}){0,2})?$";
	public static final String	REG_PRIZE_PLAN_PERCENT	= "^(([0-9]){1,3}){1}(,[0-9]{1,2})(\\ ?%)?$";
	public static final String	REG_SERIAL_NUMBER		= "^\\d{6}-\\d{2}-\\d{10}-\\d{3}$";

	public String getREG_PRIZE_PLAN_CODE() {
		return REG_PRIZE_PLAN_CODE;
	}

	public String getREG_PRIZE_PLAN_CURRENCY() {
		return REG_PRIZE_PLAN_CURRENCY;
	}

	public String getREG_PRIZE_PLAN_INTEGER() {
		return REG_PRIZE_PLAN_INTEGER;
	}

	public String getREG_PRIZE_PLAN_PERCENT() {
		return REG_PRIZE_PLAN_PERCENT;
	}

	public String getREG_SERIAL_NUMBER() {
		return REG_SERIAL_NUMBER;
	}

	/*
	 * PATERNS
	 */
	public static final String	PAT_PRIZE_PLAN_CURRENCY	= "###,##0.00 €";
	public static final String	PAT_PRIZE_PLAN_INTEGER	= "###,##0";
	public static final String	PAT_PRIZE_PLAN_DECIMAL	= "###,##0.00";
	public static final String	PAT_PRIZE_PLAN_PERCENT	= "##0.00 %";

	public String getPAT_PRIZE_PLAN_CURRENCY() {
		return PAT_PRIZE_PLAN_CURRENCY;
	}

	public String getPAT_PRIZE_PLAN_INTEGER() {
		return PAT_PRIZE_PLAN_INTEGER;
	}

	public String getPAT_PRIZE_PLAN_DECIMAL() {
		return PAT_PRIZE_PLAN_DECIMAL;
	}

	public String getPAT_PRIZE_PLAN_PERCENT() {
		return PAT_PRIZE_PLAN_PERCENT;
	}

	/*
	 * Operation Types
	 */
	public static final String	PRIZE_PLAN_EDITION_PERMISSION	= "olimpo_lotto_prizes_edit_permission";
	public static final String	PRIZE_PLAN_PUBLISH_PERMISSION	= "olimpo_lotto_prizes_publish_permission";
	public static final String	PRIZE_PLAN_DISABLE_PERMISSION	= "olimpo_lotto_prizes_disable_permission";
	public static final String	PRIZE_PLAN_CANCEL_PERMISSION	= "olimpo_lotto_prizes_cancel_permission";

	public String getPRIZE_PLAN_EDITION_PERMISSION() {
		return PRIZE_PLAN_EDITION_PERMISSION;
	}

	public String getPRIZE_PLAN_PUBLISH_PERMISSION() {
		return PRIZE_PLAN_PUBLISH_PERMISSION;
	}

	public String getPRIZE_PLAN_DISABLE_PERMISSION() {
		return PRIZE_PLAN_DISABLE_PERMISSION;
	}

	public String getPRIZE_PLAN_CANCEL_PERMISSION() {
		return PRIZE_PLAN_CANCEL_PERMISSION;
	}

	public static final String	PAGE_MODE_NEW_CREATING		= "mode-creating";
	public static final String	PAGE_MODE_NEW_EDITING		= "mode-editing";
	public static final String	PAGE_MODE_NEW_CLONING		= "mode-cloning";
	public static final String	PAGE_MODE_DETAIL_EDITING	= "mode-edition-detail";
	public static final String	PAGE_MODE_DETAIL_APPROVING	= "mode-approving";
	public static final String	PAGE_MODE_DETAIL_PUBLISHED	= "mode-published";
	public static final String	PAGE_MODE_DETAIL_DISABLED	= "mode-disabled";
	public static final String	PAGE_MODE_DETAIL_CANCELED	= "mode-canceled";
	public static final String	PAGE_MODE_DETAIL_VIEWING	= "mode-visualization";

	public String getPAGE_MODE_NEW_CREATING() {
		return PAGE_MODE_NEW_CREATING;
	}

	public String getPAGE_MODE_NEW_EDITING() {
		return PAGE_MODE_NEW_EDITING;
	}

	public String getPAGE_MODE_NEW_CLONING() {
		return PAGE_MODE_NEW_CLONING;
	}

	public String getPAGE_MODE_DETAIL_EDITING() {
		return PAGE_MODE_DETAIL_EDITING;
	}

	public String getPAGE_MODE_DETAIL_APPROVING() {
		return PAGE_MODE_DETAIL_APPROVING;
	}

	public String getPAGE_MODE_DETAIL_PUBLISHED() {
		return PAGE_MODE_DETAIL_PUBLISHED;
	}

	public String getPAGE_MODE_DETAIL_DISABLED() {
		return PAGE_MODE_DETAIL_DISABLED;
	}

	public String getPAGE_MODE_DETAIL_CANCELED() {
		return PAGE_MODE_DETAIL_CANCELED;
	}

	public String getPAGE_MODE_DETAIL_VIEWING() {
		return PAGE_MODE_DETAIL_VIEWING;
	}

	/*
	 * CONTENCY TOOLTIP messages
	 */
	public static final String	TOOLTIP_CONTINGENT_PAGINA	= "Insira o número de página no formato. <br> ###.###.### ou #########";
	public static final String	TOOLTIP_CONTINGENT_NUMBER	= "Insira o número no formato. <br> ######";
	public static final String	TOOLTIP_CONTINGENT_FRACTION	= "Insira a fração formato. <br> ##";
	public static final String	TOOLTIP_CONTINGENT_SERIE	= "Insira a série no formato. <br> ##";

	public String getTOOLTIP_CONTINGENT_PAGINA() {
		return TOOLTIP_CONTINGENT_PAGINA;
	}

	public String getTOOLTIP_CONTINGENT_NUMBER() {
		return TOOLTIP_CONTINGENT_NUMBER;
	}

	public String getTOOLTIP_CONTINGENT_FRACTION() {
		return TOOLTIP_CONTINGENT_FRACTION;
	}

	public String getTOOLTIP_CONTINGENT_SERIE() {
		return TOOLTIP_CONTINGENT_SERIE;
	}

	public static final String REG_CONTINGENT_INTEGER = "^([0-9]{1,3})((([0-9]){3}){0,2}|(\\.([0-9]){3}){0,2})?$";

	public String getREG_CONTINGENT_INTEGER() {
		return REG_CONTINGENT_INTEGER;
	}

	/*
	 * EXTRACTION TOOLTIP messages
	 */
	public static final String TOOLTIP_EXTRACTIONS_CODE = "Insira o código da extração no formato (sss/AAAA)";

	public String getTOOLTIP_EXTRACTIONS_CODE() {
		return TOOLTIP_EXTRACTIONS_CODE;
	}

	/*
	 * REGEX
	 */
	public static final String REG_EXTRACTION_CODE = "^([0-9]){3}/([0-9]{4})$";

	public String getREG_EXTRACTION_CODE() {
		return REG_EXTRACTION_CODE;
	}

	/*
	 * EXTRACTIONS HTTP PARAMETERS KEYS
	 */

	public static final String	KEY_EXTRACTION_ENTITY		= "ENTITY";
	public static final String	KEY_EXTRACTION_ID			= "extractionId";
	public static final String	KEY_EXTRACTION_NAME			= "extractionName";
	public static final String	KEY_EXTRACTION_GAME_ID		= "gameId";
	public static final String	KEY_EXTRACTION_STATUS_ID	= "extractionStatusId";

	public static final String	KEY_EXTRACTION_CODE				= "extractionCode";
	public static final String	KEY_EXTRACTION_PRIZEPLAN_ID		= "prizePlanId";
	public static final String	KEY_EXTRACTION_PRIZEPLAN_CODE	= "prizePlanCode";

	public static final String	KEY_EXTRACTION_CONTENCY_SHEETTYPE		= "pageTypeId";
	public static final String	KEY_EXTRACTION_CONTENCY_SHEETNUMBER		= "pageId";
	public static final String	KEY_EXTRACTION_CONTENCY_PAGEID			= "personalizationPageId";
	public static final String	KEY_EXTRACTION_CONTENCY_TICKETNUMBER	= "ticket";
	public static final String	KEY_EXTRACTION_CONTENCY_TICKETFRACTION	= "fraction";
	public static final String	KEY_EXTRACTION_CONTENCY_TICKETSERIE		= "series";
	public static final String	KEY_EXTRACTION_CONTENCY_CONTENCY_ID		= "contencyId";
	// public static final String KEY_EXTRACTION_CONTENCY_TICKETTYPEID = "ticketTypeId";

	public static final String	KEY_EXTRACTION_CONTENCY_ENTITY_TYPE_ID		= "entityTypeId";
	public static final String	KEY_EXTRACTION_CONTENCY_ENTITY_VALUE		= "entityValue";
	public static final String	KEY_EXTRACTION_CONTENCY_ESTABLISHMENT_CODE	= "establishmentCode";

	public static final String	KEY_EXTRACTION_PAGE		= "page";
	public static final String	KEY_EXTRACTION_SIZE		= "size";
	public static final String	KEY_EXTRACTION_SORT		= "sort";
	public static final String	KEY_EXTRACTION_SORTTYPE	= "sortType";

	public static final String	KEY_EXTRACTION_CONTINGENT_REQUEST_ID		= "requestId";
	public static final String	KEY_EXTRACTION_CONTINGENT_REQUEST_DETAIL_ID	= "requestDetailId";

	public static final String	KEY_EXTRACTION_PRINTING_PACKS	= "packsToPrint";
	public static final String	KEY_EXTRACTION_PRINTING_PAGES	= "pagesPerPack";

	public static final String	KEY_EXTRACTION_SCRUTINY_EXPORT					= "scrutinyExport";
	public static final String	KEY_EXTRACTION_SCRUTINY_EXPORT_INSERTION		= "insertion";
	public static final String	KEY_EXTRACTION_SCRUTINY_EXPORT_VERIFICATION		= "verification";
	public static final String	KEY_EXTRACTION_SCRUTINY_EXPORT_VISUALIZATION	= "visualization";
	public static final String	KEY_EXTRACTION_DRAW_RESULTS						= "extractionDrawResults";

	public String getKEY_EXTRACTION_ID() {
		return KEY_EXTRACTION_ID;
	}

	public String getKEY_EXTRACTION_PRIZEPLAN_CODE() {
		return KEY_EXTRACTION_PRIZEPLAN_CODE;
	}

	public String getKEY_EXTRACTION_ENTITY() {
		return KEY_EXTRACTION_ENTITY;
	}

	public String getKEY_EXTRACTION_NAME() {
		return KEY_EXTRACTION_NAME;
	}

	public String getKEY_EXTRACTION_GAME_ID() {
		return KEY_EXTRACTION_GAME_ID;
	}

	public String getKEY_EXTRACTION_STATUS_ID() {
		return KEY_EXTRACTION_STATUS_ID;
	}

	public String getKEY_EXTRACTION_CODE() {
		return KEY_EXTRACTION_CODE;
	}

	public String getKEY_EXTRACTION_PRIZEPLAN_ID() {
		return KEY_EXTRACTION_PRIZEPLAN_ID;
	}

	public String getKEY_EXTRACTION_CONTENCY_SHEETTYPE() {
		return KEY_EXTRACTION_CONTENCY_SHEETTYPE;
	}

	public String getKEY_EXTRACTION_CONTENCY_SHEETNUMBER() {
		return KEY_EXTRACTION_CONTENCY_SHEETNUMBER;
	}

	public String getKEY_EXTRACTION_CONTENCY_TICKETNUMBER() {
		return KEY_EXTRACTION_CONTENCY_TICKETNUMBER;
	}

	public String getKEY_EXTRACTION_CONTENCY_TICKETSERIE() {
		return KEY_EXTRACTION_CONTENCY_TICKETSERIE;
	}

	public String getKEY_EXTRACTION_CONTENCY_TICKETFRACTION() {
		return KEY_EXTRACTION_CONTENCY_TICKETFRACTION;
	}

	public String getKEY_EXTRACTION_CONTENCY_CONTENCY_ID() {
		return KEY_EXTRACTION_CONTENCY_CONTENCY_ID;
	}

	public String getKEY_EXTRACTION_CONTENCY_ENTITY_TYPE_ID() {
		return KEY_EXTRACTION_CONTENCY_ENTITY_TYPE_ID;
	}

	public String getKEY_EXTRACTION_CONTENCY_ESTABLISHMENT_CODE() {
		return KEY_EXTRACTION_CONTENCY_ESTABLISHMENT_CODE;
	}

	public String getKEY_EXTRACTION_PAGE() {
		return KEY_EXTRACTION_PAGE;
	}

	public String getKEY_EXTRACTION_SIZE() {
		return KEY_EXTRACTION_SIZE;
	}

	public String getKEY_EXTRACTION_SORT() {
		return KEY_EXTRACTION_SORT;
	}

	public String getKEY_EXTRACTION_SORTTYPE() {
		return KEY_EXTRACTION_SORTTYPE;
	}

	public String getKEY_EXTRACTION_CONTENCY_PAGEID() {
		return KEY_EXTRACTION_CONTENCY_PAGEID;
	}

	// public String getKEY_EXTRACTION_CONTENCY_TICKETTYPEID() {
	// return KEY_EXTRACTION_CONTENCY_TICKETTYPEID;
	// }

	public String getKEY_EXTRACTION_PRINTING_PACKS() {
		return KEY_EXTRACTION_PRINTING_PACKS;
	}

	public String getKEY_EXTRACTION_PRINTING_PAGES() {
		return KEY_EXTRACTION_PRINTING_PAGES;
	}

	public String getKEY_EXTRACTION_DRAW_RESULTS() {
		return KEY_EXTRACTION_DRAW_RESULTS;
	}

	/*
	 * EXTRACTION DEFAULT HTTP PARAMETERS KEYS
	 */
	public static final String	KEY_EXTRACTION_VALUE_SIZE			= "25";
	public static final String	KEY_EXTRACTION_VALUE_SIZE_HISTORY	= "1";
	public static final String	KEY_EXTRACTION_VALUE_SORT_HISTORY	= "changeDate";
	public static final String	KEY_EXTRACTION_VALUE_SORTTYPE_ASC	= "ASC";
	public static final String	KEY_EXTRACTION_VALUE_SORTTYPE_DESC	= "DESC";

	public String getKEY_EXTRACTION_VALUE_SIZE() {
		return KEY_EXTRACTION_VALUE_SIZE;
	}

	public String getKEY_EXTRACTION_VALUE_SIZE_HISTORY() {
		return KEY_EXTRACTION_VALUE_SIZE_HISTORY;
	}

	public String getKEY_EXTRACTION_VALUE_SORT_HISTORY() {
		return KEY_EXTRACTION_VALUE_SORT_HISTORY;
	}

	public String getKEY_EXTRACTION_VALUE_SORTTYPE_ASC() {
		return KEY_EXTRACTION_VALUE_SORTTYPE_ASC;
	}

	public String getKEY_EXTRACTION_VALUE_SORTTYPE_DESC() {
		return KEY_EXTRACTION_VALUE_SORTTYPE_DESC;
	}

	public static final String	PAGE_MODE_EXTRAC_CREATION			= "mode-creation";
	public static final String	PAGE_MODE_EXTRAC_CONFIGURATION		= "mode-configuration";
	public static final String	PAGE_MODE_EXTRAC_APPROVING			= "mode-approving";
	public static final String	PAGE_MODE_EXTRAC_PERSONALIZATION	= "mode-personalization";
	public static final String	PAGE_MODE_EXTRAC_PRINT				= "mode-print";
	public static final String	PAGE_MODE_EXTRAC_SALE				= "mode-sale";
	public static final String	PAGE_MODE_EXTRAC_DRAWING			= "mode-drawing";
	public static final String	PAGE_MODE_EXTRAC_PAYMENT			= "mode-payment";

	public static final String	PAGE_MODE_EXTRAC_EXPIRED	= "mode-expired";
	public static final String	PAGE_MODE_EXTRAC_SUSPENDED	= "mode-suspended";
	public static final String	PAGE_MODE_EXTRAC_CANCELED	= "mode-canceled";

	public String getPAGE_MODE_EXTRAC_CREATION() {
		return PAGE_MODE_EXTRAC_CREATION;
	}

	public String getPAGE_MODE_EXTRAC_CONFIGURATION() {
		return PAGE_MODE_EXTRAC_CONFIGURATION;
	}

	public String getPAGE_MODE_EXTRAC_APPROVING() {
		return PAGE_MODE_EXTRAC_APPROVING;
	}

	public String getPAGE_MODE_EXTRAC_PERSONALIZATION() {
		return PAGE_MODE_EXTRAC_PERSONALIZATION;
	}

	public String getPAGE_MODE_EXTRAC_PRINT() {
		return PAGE_MODE_EXTRAC_PRINT;
	}

	public String getPAGE_MODE_EXTRAC_SALE() {
		return PAGE_MODE_EXTRAC_SALE;
	}

	public String getPAGE_MODE_EXTRAC_PAYMENT() {
		return PAGE_MODE_EXTRAC_PAYMENT;
	}

	public String getPAGE_MODE_EXTRAC_DRAWING() {
		return PAGE_MODE_EXTRAC_DRAWING;
	}

	public String getPAGE_MODE_EXTRAC_EXPIRED() {
		return PAGE_MODE_EXTRAC_EXPIRED;
	}

	public String getPAGE_MODE_EXTRAC_SUSPENDED() {
		return PAGE_MODE_EXTRAC_SUSPENDED;
	}

	public String getPAGE_MODE_EXTRAC_CANCELED() {
		return PAGE_MODE_EXTRAC_CANCELED;
	}

	/*
	 * AUTOMATIC DEFAULT HTTP PARAMETERS KEYS
	 */
	public static final String KEY_AUTOMATIC_ENTITY = "ENTITY";

	public String getKEY_AUTOMATIC_ENTITY() {
		return KEY_AUTOMATIC_ENTITY;
	}

	public static final String	KEY_AUTOMATIC_VALUE_GAME_ID			= "gameId";
	public static final String	KEY_AUTOMATIC_VALUE_EXTRACTION_ID	= "extractionId";
	public static final String	KEY_AUTOMATIC_VALUE_EXECUTION_ID	= "executionId";

	public String getKEY_AUTOMATIC_VALUE_GAME_ID() {
		return KEY_AUTOMATIC_VALUE_GAME_ID;
	}

	public String getKEY_AUTOMATIC_VALUE_EXTRACTION_ID() {
		return KEY_AUTOMATIC_VALUE_EXTRACTION_ID;
	}

	public String getKEY_AUTOMATIC_VALUE_EXECUTION_ID() {
		return KEY_AUTOMATIC_VALUE_EXECUTION_ID;
	}

	/*
	 * PERSONALIZATION DEFAULT HTTP PARAMETERS KEYS
	 */
	public static final String	KEY_PERSONALIZATION_ENTITY			= "ENTITY";
	public static final String	KEY_PERSONALIZATION_ID				= "personalizationId";
	public static final String	KEY_PERSONALIZATION_PAGE_ID			= "personalizationPageId";
	public static final String	KEY_PERSONALIZATION_PAGE_TYPE_ID	= "pageTypeId";

	public static final String	KEY_PERSONALIZATION_NUMBER		= "ticket";
	public static final String	KEY_PERSONALIZATION_SERIE		= "series";
	public static final String	KEY_PERSONALIZATION_FRACTION	= "fraction";

	public String getKEY_PERSONALIZATION_ENTITY() {
		return KEY_PERSONALIZATION_ENTITY;
	}

	public static String getKEY_PERSONALIZATION_PAGE_ID() {
		return KEY_PERSONALIZATION_PAGE_ID;
	}

	public static String getKEY_PERSONALIZATION_ID() {
		return KEY_PERSONALIZATION_ID;
	}

	public static String getKEY_PERSONALIZATION_PAGE_TYPE_ID() {
		return KEY_PERSONALIZATION_PAGE_TYPE_ID;
	}

	public static String getKEY_PERSONALIZATION_NUMBER() {
		return KEY_PERSONALIZATION_NUMBER;
	}

	public static String getKEY_PERSONALIZATION_SERIE() {
		return KEY_PERSONALIZATION_SERIE;
	}

	public static String getKEY_PERSONALIZATION_FRACTION() {
		return KEY_PERSONALIZATION_FRACTION;
	}

	/*
	 * PRINTING DEFAULT HTTP PARAMETERS KEYS
	 */
	public static final String	KEY_PRINTING_ENTITY					= "ENTITY";
	public static final String	KEY_PRINTING_VALUE_GAME_ID			= "gameId";
	public static final String	KEY_PRINTING_VALUE_EXTRACTION_ID	= "extractionId";
	public static final String	KEY_PRINTING_VALUE_EXECUTION_ID		= "executionId";

	public String getKEY_PRINTING_ENTITY() {
		return KEY_PRINTING_ENTITY;
	}

	public String getKEY_PRINTING_VALUE_GAME_ID() {
		return KEY_PRINTING_VALUE_GAME_ID;
	}

	public String getKEY_PRINTING_VALUE_EXTRACTION_ID() {
		return KEY_PRINTING_VALUE_EXTRACTION_ID;
	}

	public String getKEY_PRINTING_VALUE_EXECUTION_ID() {
		return KEY_PRINTING_VALUE_EXECUTION_ID;
	}

	/*
	 * RESERVATIONS DEFAULT PARAMETERS KEYS
	 */
	public static final String	RESERVATIONS_PHYSICAL_ID		= "reservationPhysicalId";
	public static final String	RESERVATIONS_ESTABLISHMENT_CODE	= "entityValue";
	public static final String	RESERVATIONS_ESTABLISHMENT_ID	= "establishmentId";
	public static final String	RESERVATIONS_REQUEST_DATE		= "requestDate";
	public static final String	RESERVATION_FIRST_EXTRACTION_ID	= "firstExtractionId";

	public static final String	RESERVATIONS_REQUESTED_TICKET	= "requestedTicket";
	public static final String	RESERVATIONS_QUANTITY_TICKETS	= "quantityOfRequestedTickets";

	public static final String RESERVATIONS_REQUEST_PHYSICAL_DATE = "reservationPhysicalStatusDate";

	public static final String	RESERVATIONS_REQUEST_ID				= "requestId";
	public static final String	RESERVATIONS_REQUEST_SELECT_TICKET	= "selectedTicket";
	public static final String	RESERVATIONS_PAGE_ID_LIST			= "pageIdList";
	public static final String	RESERVATIONS_PAGE					= "page";

	public static final String RESERVATIONS_REASON_ENTITY_TYPE = "reasonStatusEntityTypeId";

	public static final String	RESERVATIONS_REJECT_SUCCESS	= "Rejeição de reserva efectuada com Sucesso.";
	public static final String	RESERVATIONS_REJECT_ERROR	= "Erro a efectuar operação de rejeiçao de reserva.";

	public static final String	RESERVATIONS_ACCEPT_SUCCESS	= "Aceitação de reserva efectuada com sucesso.";
	public static final String	RESERVATIONS_ACCEPT_ERROR	= "Erro a efectuar operação de aceitação de reserva.";

	/*
	 * NEW ESTABLISHMENTS DEFAULT PARAMETERS KEYS
	 */
	public static final String	NEW_ESTABLISHMENT_VALUE			= "entityValue";
	public static final String	NEW_ESTABLISHMENT_CODE			= "establishmentCode";
	public static final String	NEW_ESTABLISHMENT_REQUEST_ID	= "requestId";
	public static final String	NEW_ESTABLISHMENT_EXECUTION_ID	= "executionId";
	public static final String	NEW_ESTABLISHMENT_CODE_NEW		= "newEstablishmentCode";
	public static final String	NEW_ESTABLISHMENT_CODE_OLD		= "oldEstablishmentCode";

	/*
	 * ------------------------------------------------------------------
	 */
	public static final String	CONTINGENT_ENTITY_TYPE_ESTABLISHMENT				= "1";
	public static final String	CONTINGENT_ENTITY_TYPE_OD							= "2";
	public static final String	CONTINGENT_ENTITY_TYPE_RETAIL						= "101";
	public static final String	CONTINGENT_ESTABLISHMENT_PAGINATION_DEFAULT_PAGE	= "1";
	public static final String	CONTINGENT_ESTABLISHMENT_PAGINATION_DEFAULT_SIZE	= "1";
	public static final String	CONTINGENT_LIST_PAGINATION_ALL_PAGE					= "0";
	public static final String	CONTINGENT_LIST_PAGINATION_ALL_SIZE					= "0";

	public static final String	CONTINGENT_SEARCHED_PAGE_LIST				= "contingentSearchedPageList";
	public static final String	CONTINGENT_UPDATE_PAGE_WS_TYPE_PARAM_LABEL	= "moveTo";
	public static final String	CONTINGENT_UPDATE_PAGE_WS_REMOVE			= "OD";
	public static final String	CONTINGENT_UPDATE_PAGE_WS_ADD				= "ESTABLISHMENT";
	public static final String	CONTINGENT_INVALID_PAGE_QUANTITY_VALUE		= "O valor a remover &eacute; inv&aacute;lido. O valor introduzido deve ser inferior ao contingente atual.";

	public String getCONTINGENT_ENTITY_TYPE_ESTABLISHMENT() {
		return CONTINGENT_ENTITY_TYPE_ESTABLISHMENT;
	}

	public String getCONTINGENT_ENTITY_TYPE_RETAIL() {
		return CONTINGENT_ENTITY_TYPE_RETAIL;
	}

	/*
	 * MATRIX Keys
	 */

	public static final String	KEY_MATRIX_STATUS_ID			= "matrixStatusId";
	public static final String	KEY_MATRIX_ESTABLISHMENT_ID		= "establishmentMatrixId";
	public static final String	KEY_MATRIX_SERIAL_NUMBER		= "serialNumber";
	public static final String	KEY_MATRIX_TICKET				= "ticket";
	public static final String	KEY_MATRIX_SERIES				= "series";
	public static final String	KEY_MATRIX_FRACTION				= "fraction";
	public static final String	KEY_MATRIX_TERMINAL_CODE		= "terminalCode";
	public static final String	KEY_MATRIX_TRANSACTION_SERIAL	= "originSerialNumber";
	public static final String	KEY_MATRIX_WAGER_SERIAL			= "betSerialNumber";
	public static final String	KEY_MATRIX_GAME_ID				= "gameId";
	public static final String	KEY_MATRIX_EXTRACTION_CODE		= "extractionCode";
	public static final String	KEY_MATRIX_WAGER_ID				= "wagerId";
	public static final String	KEY_MATRIX_PAGE_ID				= "pageId";
	public static final String	KEY_MATRIX_ID					= "matrixId";
	public static final String	KEY_PACK_ID						= "packId";
	public static final String	KEY_REQUEST_ID					= "requestId";
	
	public static final String	KEY_WAGER_STATUS_SHDES			= "wagerStatusShdes";

	public static final String	CONSTANT_MATRIX_DETAIL_HISTORY			= "historyTab";
	public static final String	CONSTANT_MATRIX_DETAIL_WAGER			= "wagerTab";
	public static final String	CONSTANT_MATRIX_DETAIL_PRIZE			= "prizeTab";
	public static final String	CONSTANT_MATRIX_DETAIL_PAGE				= "pageTab";
	public static final String	CONSTANT_MATRIX_DETAIL_PACK				= "packTab";
	public static final String	CONSTANT_MATRIX_DETAIL_TRANSACTIONS		= "transactionsTab";
	public static final String	CONSTANT_MATRIX_DETAIL_ESTABLISHMENT	= "establishmentTab";
	
	public String getCONSTANT_MATRIX_DETAIL_HISTORY() {
		return CONSTANT_MATRIX_DETAIL_HISTORY;
	}
	
	public String getCONSTANT_MATRIX_DETAIL_WAGER() {
		return CONSTANT_MATRIX_DETAIL_WAGER;
	}
	
	public String getCONSTANT_MATRIX_DETAIL_PRIZE() {
		return CONSTANT_MATRIX_DETAIL_PRIZE;
	}
	
	public String getCONSTANT_MATRIX_DETAIL_PAGE() {
		return CONSTANT_MATRIX_DETAIL_PAGE;
	}
	
	public String getCONSTANT_MATRIX_DETAIL_PACK() {
		return CONSTANT_MATRIX_DETAIL_PACK;
	}
	
	public String getCONSTANT_MATRIX_DETAIL_TRANSACTIONS() {
		return CONSTANT_MATRIX_DETAIL_TRANSACTIONS;
	}
	
	public String getCONSTANT_MATRIX_DETAIL_ESTABLISHMENT() {
		return CONSTANT_MATRIX_DETAIL_ESTABLISHMENT;
	}
	

	public static final String	CONSTANT_MATRIX_DETAIL_TICKET_TYPE_1	= "Físico";
	public static final String	CONSTANT_MATRIX_DETAIL_TICKET_TYPE_2	= "Virtual";
	
	public static final String	CONSTANT_WAGER_STATUS_REGISTERED		= "WS_R";

	/*
	 * MATRIX permissions
	 */
	public static final String CONTINGENT_PRIZE_PERMISSION = "olimpo_lotto_contingent_prize_permission";
	public static final String CONTINGENT_TRANSACTIONS_PERMISSION = "olimpo_lotto_contingent_transactions_permission";

	public String getCONTINGENT_PRIZE_PERMISSION() {
		return CONTINGENT_PRIZE_PERMISSION;
	}
	
	public String getCONTINGENT_TRANSACTIONS_PERMISSION() {
		return CONTINGENT_TRANSACTIONS_PERMISSION;
	}

	/*
	 * Virtual Reservation Keys
	 * 
	 */
	public static final String	KEY_RESERVATION_VIRTUAL_ID				= "reservationVirtualId";
	public static final String	KEY_RESERVATION_VIRTUAL_CODE			= "reservationCode";
	public static final String	KEY_RESERVATION_VIRTUAL_SERIAL			= "requestSerialNumber";
	public static final String	KEY_RESERVATION_VIRTUAL_STATUS_DATE		= "reservationVirtualStatusDate";
	public static final String	KEY_RESERVATION_VIRTUAL_STATUS_SHDES	= "requestStatusShdes";
	public static final String	KEY_RESERVATION_START_DATE				= "searchFromRequestDate";
	public static final String	KEY_RESERVATION_END_DATE				= "searchToRequestDate";
	public static final String	KEY_CHANNEL_TYPE_SHDES					= "channelShdes";
	public static final String	KEY_RESERVATION_VIRTUAL_STATUS			= "requestStatusShdes";
	public static final String	KEY_PLAYER_IDENTIFICATION				= "playerIdentification";
	public static final String	KEY_PLAYER_IDENTIFICATION_TYPE_SHDES	= "playerIdentificationTypeShdes";
	public static final String	KEY_PLAYER_CONTACT						= "playerContact";
	public static final String	KEY_PLAYER_CARD							= "playerCardCode";
	public static final String	KEY_TERMINAL_CODE						= "terminalCode";
	public static final String	KEY_GAME_NUMBER							= "gameNumber";

	/*
	 * Virtual Reservation Tooltips and regex
	 * 
	 */
	public static final String	REG_RESERVATION_VIRTUAL_SERIAL	= "^\\d{6}-\\d{2}-\\d{10}-\\d{3}$";
	public static final String	REG_TERMINAL_CODE				= "^[0-9]{7}$";
	public static final String	REG_ESTABLISHMENT_CODE			= "^\\d{6}_\\d{2}$";
	public static final String	REG_CHANNEL_CODE				= "^\\d{6}_\\d{2}$";
	public static final String	REG_PLAYER_NIF					= "^[0-9]{9}$";
	public static final String	REG_PLAYER_CONTACT				= "^[0-9]{9}$";
	public static final String	REG_PLAYER_CARD					= "^[0-9]*$";
	public static final String	REG_PAGE_AMOUNT					= "^[0-9]*$";

	public String getREG_RESERVATION_VIRTUAL_SERIAL() {
		return REG_RESERVATION_VIRTUAL_SERIAL;
	}

	public String getREG_TERMINAL_CODE() {
		return REG_TERMINAL_CODE;
	}

	public String getREG_ESTABLISHMENT_CODE() {
		return REG_ESTABLISHMENT_CODE;
	}

	public String getREG_CHANNEL_CODE() {
		return REG_CHANNEL_CODE;
	}

	public String getREG_PLAYER_NIF() {
		return REG_PLAYER_NIF;
	}

	public String getREG_PLAYER_CONTACT() {
		return REG_PLAYER_CONTACT;
	}

	public String getREG_PLAYER_CARD() {
		return REG_PLAYER_CARD;
	}

	public String getREG_PAGE_AMOUNT() {
		return REG_PAGE_AMOUNT;
	}

	public static final String	TOOLTIP_DATE_INPUT			= "Formato da data: <br> DD/MM/AAAA";
	public static final String	TOOLTIP_TERMINAL_CODE		= "Insira exatamente 7 dígitos.";
	public static final String	TOOLTIP_ESTABLISHMENT_CODE	= "Insira o código do Estabelecimento. (######_##)";
	public static final String	TOOLTIP_CHANNEL_CODE		= "Insira o código do Canal. (######_##)";
	public static final String	TOOLTIP_PLAYER_NIF			= "Insira o N&uacute;mero de Identificação Fiscal. (#########)";
	public static final String	TOOLTIP_PLAYER_CONTACT		= "Insira o N&uacute;mero de Contacto. (#########)";
	public static final String	TOOLTIP_PLAYER_CARD			= "Insira o n&uacute;mero de Cartão de Jogador no formato num&eacute;rico.";
	public static final String	TOOLTIP_PAGE_AMOUNT			= "Insira o n&uacute;mero de Folhas pretendido.";

	public String getTOOLTIP_DATE_INPUT() {
		return TOOLTIP_DATE_INPUT;
	}

	public String getTOOLTIP_TERMINAL_CODE() {
		return TOOLTIP_TERMINAL_CODE;
	}

	public String getTOOLTIP_ESTABLISHMENT_CODE() {
		return TOOLTIP_ESTABLISHMENT_CODE;
	}

	public String getTOOLTIP_CHANNEL_CODE() {
		return TOOLTIP_CHANNEL_CODE;
	}

	public String getTOOLTIP_PLAYER_NIF() {
		return TOOLTIP_PLAYER_NIF;
	}

	public String getTOOLTIP_PLAYER_CONTACT() {
		return TOOLTIP_PLAYER_CONTACT;
	}

	public String getTOOLTIP_PLAYER_CARD() {
		return TOOLTIP_PLAYER_CARD;
	}

	public String getTOOLTIP_PAGE_AMOUNT() {
		return TOOLTIP_PAGE_AMOUNT;
	}

	/*************************************************************************************************************************
	 * 
	 * EXPORT
	 * 
	 *************************************************************************************************************************/

	public static final String	EXPORT_MASK_EURO				= "###,##0.00 €";
	public static final String	EXPORT_MASK_DOUBLE				= "#,##0.00";
	public static final String	EXPORT_MASK_INTEGER				= "#,##0";
	public static final String	EXPORT_MASK_DOUBLE_NULL_ROUND	= "#,##0.0####";
	public static final String	EXPORT_MASK_PERCENTAGE			= "#,##0.0#### %";
	public static final String	EXPORT_MASK_DATE				= "dd-MM-yyyy";

	/********
	 * 
	 * Extraction Contingent tooltip messages
	 * 
	 *******/
	public static final String	TOOLTIP_CONTINGENT_ADD		= "Insira um valor inteiro a adicionar ao contingente.";
	public static final String	TOOLTIP_CONTINGENT_REMOVE	= "Insira um valor inteiro a remover ao contingente.";

	public String getTOOLTIP_CONTINGENT_ADD() {
		return TOOLTIP_CONTINGENT_ADD;
	}

	public String getTOOLTIP_CONTINGENT_REMOVE() {
		return TOOLTIP_CONTINGENT_REMOVE;
	}

	/*************************************************************************************************************************
	 * 
	 * PERMISSIONS
	 * 
	 *************************************************************************************************************************/
	public static final String	EXTRACTIONS_MNG_MASTER_PERMISSION	= "olimpo_extractions_management_master";
	public static final String	EXTRACTIONS_MNG_CREATE_PERMISSION	= "olimpo_extractions_management_create";
	public static final String	EXTRACTIONS_MNG_EDIT_PERMISSION		= "olimpo_extractions_management_edit";
	public static final String	EXTRACTIONS_MNG_APPROVE_PERMISSION	= "olimpo_extractions_management_approve";
	// public static final String EXTRACTIONS_MNG_REJECT_PERMISSION = "olimpo_extractions_management_reject";
	public static final String	EXTRACTIONS_MNG_PUBLISH_PERMISSION		= "olimpo_extractions_management_publish";
	public static final String	EXTRACTIONS_MNG_EDIT_ADMIN_PERMISSION	= "olimpo_extractions_management_admin_edit";

	public String getEXTRACTIONS_MNG_EDIT_ADMIN_PERMISSION() {
		return EXTRACTIONS_MNG_EDIT_ADMIN_PERMISSION;
	}

	public String getEXTRACTIONS_MNG_MASTER_PERMISSION() {
		return EXTRACTIONS_MNG_MASTER_PERMISSION;
	}

	public String getEXTRACTIONS_MNG_CREATE_PERMISSION() {
		return EXTRACTIONS_MNG_CREATE_PERMISSION;
	}

	public String getEXTRACTIONS_MNG_EDIT_PERMISSION() {
		return EXTRACTIONS_MNG_EDIT_PERMISSION;
	}

	public String getEXTRACTIONS_MNG_APPROVE_PERMISSION() {
		return EXTRACTIONS_MNG_APPROVE_PERMISSION;
	}

	public String getEXTRACTIONS_MNG_PUBLISH_PERMISSION() {
		return EXTRACTIONS_MNG_PUBLISH_PERMISSION;
	}

	/********************************************************************************************************************************
	 * Extraction Suspension
	 * 
	 *************************************************************************************************************************/
	public static final String	EXTRACTIONS_MNG_SUSPEND_PERMISSION	= "olimpo_extractions_suspend";
	public static final String	EXTRACTIONS_MNG_ACTIVATE_PERMISSION	= "olimpo_extractions_activate";

	public String getEXTRACTIONS_MNG_SUSPEND_PERMISSION() {
		return EXTRACTIONS_MNG_SUSPEND_PERMISSION;
	}

	public String getEXTRACTIONS_MNG_ACTIVATE_PERMISSION() {
		return EXTRACTIONS_MNG_ACTIVATE_PERMISSION;
	}

	/********************************************************************************************************************************
	 * Extraction Personalization Permissions
	 * 
	 *************************************************************************************************************************/
	public static String	PERSONALIZATION_AUTOMATIC_DETAIL	= "olimpo_extractions_management_p_aut_detail";
	public static String	PERSONALIZATION_AUTOMATIC_PROCESS	= "olimpo_extractions_management_p_aut_process";
	public static String	PERSONALIZATION_AUTOMATIC_REPROCESS	= "olimpo_extractions_management_p_aut_reprocess";

	public static String	PERSONALIZATION_COMERCIAL_NE_PROCESS	= "olimpo_extractions_management_p_com_ne_process";
	public static String	PERSONALIZATION_COMERCIAL_NE_CANCEL		= "olimpo_extractions_management_p_com_ne_cancel";
	public static String	PERSONALIZATION_COMERCIAL_NE_MOVE		= "olimpo_extractions_management_p_com_ne_move";
	public static String	PERSONALIZATION_COMERCIAL_CNTGT_PROCESS	= "olimpo_extractions_management_p_com_cntgt_process";
	public static String	PERSONALIZATION_COMERCIAL_CNTGT_EDIT	= "olimpo_extractions_management_p_com_cntgt_edit";
	public static String	PERSONALIZATION_COMERCIAL_ACPT_PROCESS	= "olimpo_extractions_management_p_com_acpt_process";
	public static String	PERSONALIZATION_COMERCIAL_REPORT		= "olimpo_extractions_management_p_com_report";

	public static String	PERSONALIZATION_DIRA_CC_PROCESS			= "olimpo_extractions_management_p_dira_cc_process";
	public static String	PERSONALIZATION_DIRA_CC_EDIT			= "olimpo_extractions_management_p_dira_cc_edit";
	public static String	PERSONALIZATION_DIRA_PHNUM_PROCESS		= "olimpo_extractions_management_p_dira_phnum_process";
	public static String	PERSONALIZATION_DIRA_PHNUM_EDIT			= "olimpo_extractions_management_p_dira_phnum_edit";
	public static String	PERSONALIZATION_DIRA_NUM_PROCESS		= "olimpo_extractions_management_p_dira_num_process";
	public static String	PERSONALIZATION_DIRA_NUM_ADD			= "olimpo_extractions_management_p_dira_num_add";
	public static String	PERSONALIZATION_DIRA_NUM_REMOVE			= "olimpo_extractions_management_p_dira_num_remove";
	public static String	PERSONALIZATION_DIRA_NUM_MOVEFRACTION	= "olimpo_extractions_management_p_dira_num_mvfract";
	public static String	PERSONALIZATION_DIRA_ACPT_PROCESS		= "olimpo_extractions_management_p_dira_acpt_process";
	public static String	PERSONALIZATION_DIRA_REPORT				= "olimpo_extractions_management_p_dira_report";

	public static String	PERSONALIZATION_AUDIT_PROCESS		= "olimpo_extractions_management_p_audit";
	public static String	PERSONALIZATION_AUDIT_REPROCESS		= "olimpo_extractions_management_p_reaudit";
	public static String	PERSONALIZATION_PREPRINT_PROCESS	= "olimpo_extractions_management_p_preprint";
	public static String	PERSONALIZATION_PREPRINT_REPROCESS	= "olimpo_extractions_management_p_repreprint";
	public static String	PERSONALIZATION_AUDIT_ACCEPT		= "olimpo_extractions_management_p_audit_accept";

	public String getPERSONALIZATION_AUTOMATIC_DETAIL() {
		return PERSONALIZATION_AUTOMATIC_DETAIL;
	}

	public String getPERSONALIZATION_AUTOMATIC_PROCESS() {
		return PERSONALIZATION_AUTOMATIC_PROCESS;
	}

	public String getPERSONALIZATION_AUTOMATIC_REPROCESS() {
		return PERSONALIZATION_AUTOMATIC_REPROCESS;
	}

	public String getPERSONALIZATION_COMERCIAL_NE_PROCESS() {
		return PERSONALIZATION_COMERCIAL_NE_PROCESS;
	}

	public String getPERSONALIZATION_COMERCIAL_NE_CANCEL() {
		return PERSONALIZATION_COMERCIAL_NE_CANCEL;
	}

	public String getPERSONALIZATION_COMERCIAL_NE_MOVE() {
		return PERSONALIZATION_COMERCIAL_NE_MOVE;
	}

	public String getPERSONALIZATION_COMERCIAL_CNTGT_PROCESS() {
		return PERSONALIZATION_COMERCIAL_CNTGT_PROCESS;
	}

	public String getPERSONALIZATION_COMERCIAL_CNTGT_EDIT() {
		return PERSONALIZATION_COMERCIAL_CNTGT_EDIT;
	}

	public String getPERSONALIZATION_COMERCIAL_ACPT_PROCESS() {
		return PERSONALIZATION_COMERCIAL_ACPT_PROCESS;
	}

	public String getPERSONALIZATION_COMERCIAL_REPORT() {
		return PERSONALIZATION_COMERCIAL_REPORT;
	}

	public String getPERSONALIZATION_DIRA_CC_PROCESS() {
		return PERSONALIZATION_DIRA_CC_PROCESS;
	}

	public String getPERSONALIZATION_DIRA_CC_EDIT() {
		return PERSONALIZATION_DIRA_CC_EDIT;
	}

	public String getPERSONALIZATION_DIRA_PHNUM_PROCESS() {
		return PERSONALIZATION_DIRA_PHNUM_PROCESS;
	}

	public String getPERSONALIZATION_DIRA_PHNUM_EDIT() {
		return PERSONALIZATION_DIRA_PHNUM_EDIT;
	}

	public String getPERSONALIZATION_DIRA_NUM_PROCESS() {
		return PERSONALIZATION_DIRA_NUM_PROCESS;
	}

	public String getPERSONALIZATION_DIRA_NUM_ADD() {
		return PERSONALIZATION_DIRA_NUM_ADD;
	}

	public String getPERSONALIZATION_DIRA_NUM_REMOVE() {
		return PERSONALIZATION_DIRA_NUM_REMOVE;
	}

	public String getPERSONALIZATION_DIRA_NUM_MOVEFRACTION() {
		return PERSONALIZATION_DIRA_NUM_MOVEFRACTION;
	}

	public String getPERSONALIZATION_DIRA_ACPT_PROCESS() {
		return PERSONALIZATION_DIRA_ACPT_PROCESS;
	}

	public String getPERSONALIZATION_DIRA_REPORT() {
		return PERSONALIZATION_DIRA_REPORT;
	}

	public String getPERSONALIZATION_AUDIT_PROCESS() {
		return PERSONALIZATION_AUDIT_PROCESS;
	}

	public String getPERSONALIZATION_AUDIT_REPROCESS() {
		return PERSONALIZATION_AUDIT_REPROCESS;
	}

	public String getPERSONALIZATION_PREPRINT_PROCESS() {
		return PERSONALIZATION_PREPRINT_PROCESS;
	}

	public String getPERSONALIZATION_PREPRINT_REPROCESS() {
		return PERSONALIZATION_PREPRINT_REPROCESS;
	}

	public String getPERSONALIZATION_AUDIT_ACCEPT() {
		return PERSONALIZATION_AUDIT_ACCEPT;
	}

	/********************************************************************************************************************************
	 * Extraction Printing Permissions
	 * 
	 *************************************************************************************************************************/
	public static String	PRINTING_TEST_PRINT_PROCESS			= "olimpo_extractions_management_i_test_print_process";
	public static String	PRINTING_TEST_ACCEPT_PROCESS		= "olimpo_extractions_management_i_test_acpt_process";
	public static String	PRINTING_EXTRACTION_PRINT_PROCESS	= "olimpo_extractions_management_i_extr_print_process";
	public static String	PRINTING_EXTRACTION_ACCEPT_PROCESS	= "olimpo_extractions_management_i_extr_acpt_process";

	public String getPRINTING_TEST_PRINT_PROCESS() {
		return PRINTING_TEST_PRINT_PROCESS;
	}

	public String getPRINTING_TEST_ACCEPT_PROCESS() {
		return PRINTING_TEST_ACCEPT_PROCESS;
	}

	public String getPRINTING_EXTRACTION_PRINT_PROCESS() {
		return PRINTING_EXTRACTION_PRINT_PROCESS;
	}

	public String getPRINTING_EXTRACTION_ACCEPT_PROCESS() {
		return PRINTING_EXTRACTION_ACCEPT_PROCESS;
	}

	/********************************************************************************************************************************
	 * Extraction Logistic Permissions
	 * 
	 *************************************************************************************************************************/
	public static String LOGISTIC_SEND_PROCESS = "olimpo_extractions_logistic_send";

	public String getLOGISTIC_SEND_PROCESS() {
		return LOGISTIC_SEND_PROCESS;
	}

	/********************************************************************************************************************************
	 * Extraction Sales Permissions
	 * 
	 *************************************************************************************************************************/
	public static String SALES_ACCEPT_PROCESS = "olimpo_extractions_sales_aprove";

	public String getSALES_ACCEPT_PROCESS() {
		return SALES_ACCEPT_PROCESS;
	}

	/********************************************************************************************************************************
	 * Extraction Scrutiny Permissions
	 * 
	 *************************************************************************************************************************/
	public static String	SCRUTINY_DRAW_INIT		= "olimpo_ext_draw_init";
	public static String	SCRUTINY_DRAW_SEAL		= "olimpo_ext_draw_seal";
	public static String	SCRUTINY_DRAW_STAT		= "olimpo_ext_draw_stat";
	public static String	SCRUTINY_DRAW_INSERT	= "olimpo_ext_draw_insert";
	public static String	SCRUTINY_DRAW_VALIDATE	= "olimpo_ext_draw_validate";
	public static String	SCRUTINY_DRAW_VIEW		= "olimpo_ext_draw_view";
	public static String	SCRUTINY_DRAW_SYNC		= "olimpo_ext_draw_sync";
	public static String	SCRUTINY_DRAW_PRIZES	= "olimpo_ext_draw_prizes";
	public static String	SCRUTINY_DRAW_PRP		= "olimpo_ext_draw_prp";
	public static String	SCRUTINY_DRAW_LOP		= "olimpo_ext_draw_lop";
	public static String	SCRUTINY_DRAW_TAX		= "olimpo_ext_draw_tax";
	public static String	SCRUTINY_DRAW_APPROVE	= "olimpo_ext_draw_approve";

	public String getSCRUTINY_DRAW_INIT() {
		return SCRUTINY_DRAW_INIT;
	}

	public String getSCRUTINY_DRAW_SEAL() {
		return SCRUTINY_DRAW_SEAL;
	}

	public String getSCRUTINY_DRAW_STAT() {
		return SCRUTINY_DRAW_STAT;
	}

	public String getSCRUTINY_DRAW_INSERT() {
		return SCRUTINY_DRAW_INSERT;
	}

	public String getSCRUTINY_DRAW_VALIDATE() {
		return SCRUTINY_DRAW_VALIDATE;
	}

	public String getSCRUTINY_DRAW_VIEW() {
		return SCRUTINY_DRAW_VIEW;
	}

	public String getSCRUTINY_DRAW_SYNC() {
		return SCRUTINY_DRAW_SYNC;
	}

	public String getSCRUTINY_DRAW_PRIZES() {
		return SCRUTINY_DRAW_PRIZES;
	}

	public String getSCRUTINY_DRAW_PRP() {
		return SCRUTINY_DRAW_PRP;
	}

	public String getSCRUTINY_DRAW_LOP() {
		return SCRUTINY_DRAW_LOP;
	}

	public String getSCRUTINY_DRAW_TAX() {
		return SCRUTINY_DRAW_TAX;
	}

	public String getSCRUTINY_DRAW_APPROVE() {
		return SCRUTINY_DRAW_APPROVE;
	}
	
	
	
	
	
	public static final String TITLE_MAIN = "Ferramentas de Gestão";
	
	public String getTITLE_MAIN() {return TITLE_MAIN;}
	
	// ServerMSGs
	public static final String MSG_UI_WARNING_CONFIDENTIAL = "A presente aplicação informática contém informação classificada de CONFIDENCIAL pelo que deverá ser manuseada em conformidade.";
	public static final String MSG_UI_NO_AREA_ACCESS = "Não tem permissões de acesso às ferramentas de gestão. Por favor contacte o seu superior hierárquico.";
	public static final String MSG_UI_TRY_OR_CONTACT = "Tente novamente ou contacte o seu superior hierárquico.";
	public static final String MSG_UI_LOGIN_PROBLEM = "Ocorreu um erro na autenticação.";
	public static final String MSG_UI_NO_ACCESS = "O utilizador que introduziu não tem acesso à plataforma.";
	public static final String MSG_UI_LOGIN_CREDENTIALS = "Os seus dados:";
	public static final String MSG_UI_BAD_CREDENTIALS = "O utilizador ou password que introduziu não estão corretos.";
	public static final String MSG_UI_USER_INACTIVE = "O utilizador que introduziu não está ativo.";
	public static final String MSG_UI_EQUAL_PASSWORDS = "A nova password tem de ser diferente da antiga.";
	public static final String MSG_UI_DIF_PASSWORDS = "A nova password tem de ser igual à de confirmação.";
	public static final String MSG_UI_VALIDATION_FAIL = "A nova password não cumpre os requesitos.";
	public static final String MSG_UI_PASSWORD_FLAG = "A sua password é provisória. Por favor altere-a.";
	public static final String MSG_UI_PASSWORD_EXPIRED = "A sua password expirou. Por favor altere-a.";
	public static final String MSG_UI_SESSION_TIMEOUT = "A sua sessão expirou. Faça login para continuar.";
	public static final String MSG_UI_PASSWORD_CHANGED = "Password alterada com sucesso!";
	public static final String MSG_UI_ERROR_EQUAL_PASSWORDS = "As passwords têm de ser diferentes!";
	public static final String MSG_UI_ERROR_DIF_PASSWORDS = "As passwords são diferentes!";
	public static final String MSG_UI_GENERIC_CANT_PROCESS_CRITERIAS = "O servidor não consegui processar os critérios fornecidos.";
	public static final String MSG_UI_CAPS_LOCK_ON = "Caps Lock ativo";
	
	public String getMSG_UI_WARNING_CONFIDENTIAL() {return MSG_UI_WARNING_CONFIDENTIAL;}
	public String getMSG_UI_NO_AREA_ACCESS() {return MSG_UI_NO_AREA_ACCESS;}
	public String getMSG_UI_TRY_OR_CONTACT() {return MSG_UI_TRY_OR_CONTACT;}
	public String getMSG_UI_LOGIN_PROBLEM() {return MSG_UI_LOGIN_PROBLEM;}
	public String getMSG_UI_NO_ACCESS() {return MSG_UI_NO_ACCESS;}
	public String getMSG_UI_LOGIN_CREDENTIALS() {return MSG_UI_LOGIN_CREDENTIALS;}
	public String getMSG_UI_BAD_CREDENTIALS() {return MSG_UI_BAD_CREDENTIALS;}
	public String getMSG_UI_USER_INACTIVE() {return MSG_UI_USER_INACTIVE;}
	public String getMSG_UI_EQUAL_PASSWORDS() {return MSG_UI_EQUAL_PASSWORDS;}
	public String getMSG_UI_DIF_PASSWORDS() {return MSG_UI_DIF_PASSWORDS;}
	public String getMSG_UI_VALIDATION_FAIL() {return MSG_UI_VALIDATION_FAIL;}
	public String getMSG_UI_PASSWORD_FLAG() {return MSG_UI_PASSWORD_FLAG;}
	public String getMSG_UI_PASSWORD_EXPIRED() {return MSG_UI_PASSWORD_EXPIRED;}
	public String getMSG_UI_SESSION_TIMEOUT() {return MSG_UI_SESSION_TIMEOUT;}
	public String getMSG_UI_PASSWORD_CHANGED() {return MSG_UI_PASSWORD_CHANGED;}
	public String getMSG_UI_ERROR_EQUAL_PASSWORDS() {return MSG_UI_ERROR_EQUAL_PASSWORDS;}
	public String getMSG_UI_ERROR_DIF_PASSWORDS() {return MSG_UI_ERROR_DIF_PASSWORDS;}
	public String getMSG_UI_GENERIC_CANT_PROCESS_CRITERIAS() {return MSG_UI_GENERIC_CANT_PROCESS_CRITERIAS;}
	public String getMSG_UI_CAPS_LOCK_ON() {return MSG_UI_CAPS_LOCK_ON;}
	
	// Placeholders
	public static final String PLACEHOLDER_UTILIZADOR = "Nome de Utilizador";
	public static final String PLACEHOLDER_PASSWORD = "Password";
	public static final String PLACEHOLDER_NEW_PASSWORD = "Nova Password";
	public static final String PLACEHOLDER_CONF_PASSWORD = "Confirme a Password";
	
	public String getPLACEHOLDER_UTILIZADOR() {return PLACEHOLDER_UTILIZADOR;}
	public String getPLACEHOLDER_PASSWORD() {return PLACEHOLDER_PASSWORD;}
	public String getPLACEHOLDER_NEW_PASSWORD() {return PLACEHOLDER_NEW_PASSWORD;}
	public String getPLACEHOLDER_CONF_PASSWORD() {return PLACEHOLDER_CONF_PASSWORD;}
	
}
