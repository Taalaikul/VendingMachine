package com.techelevator;

import com.techelevator.view.Inventory;
import com.techelevator.view.Items;
import com.techelevator.view.Menu;

import java.util.List;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT };

	private static final String PURCHASE_MENU_FEED_MONEY = "Feed Money";
	private static final String PURCHASE_MENU_SELECT_PRODUCT = "Select Product";
	private static final String PURCHASE_MENU_FINISH_TRANSACTION = "Finish Transaction";
	private static final String[] PURCHASE_MENU_OPTIONS = {PURCHASE_MENU_FEED_MONEY, PURCHASE_MENU_SELECT_PRODUCT, PURCHASE_MENU_FINISH_TRANSACTION};
	private Menu menu;

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}

	public String[] run() {
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				List<Items> allItems = Inventory.getAllItems();
				System.out.println(allItems);
				// display vending machine items
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase
				menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
				if(choice.equals(PURCHASE_MENU_FEED_MONEY)){

				}else if(choice.equals(PURCHASE_MENU_SELECT_PRODUCT)){

				}else if(choice.equals(PURCHASE_MENU_FINISH_TRANSACTION)){
					return MAIN_MENU_OPTIONS;
				}

			} else if (choice.equals(MAIN_MENU_OPTION_EXIT)) {
				//exit
				System.out.println("Please come back again!");
				break;
			}
		}
		return new String[0];
	}

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
