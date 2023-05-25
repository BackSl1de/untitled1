package workers;

import model.*;

import java.util.Collection;

public class Trader {

    private int id;
    private String name;
    private String surname;
    private String username;
    private String password;

    private String channel;
    //MT или TT

    public Collection<Magazine> getListOfPlannedMagazine() {
        //список магазинов фор тудей
        return null;
    }

    public Collection<Magazine> getListOfNonPlannedMagazine() {
        //список точек вне плана
        return null;
    }

    public void updateSingleMagazine() {
        //открываем точку,отседова нас перекидывает на снятие координат,а дальше на  нижестоящий функционал
        //ограничение на апдейт не больше 1ого в день
    }


    public MagazineInfo getMagazineInfo() {
        //информация по магазинам
        return null;
    }

    public void updateMagazineInfo() {
        // изменяем поля
    }

    public Task getTasks() {
        //открыть список тасков
        return null;
    }

    public void addNewTask() {
        //добавить таску
    }

    public void updateTaskStatus() {
        //меняем статус таски
    }

    public void addPhoto() {
        //функционал для добавления фото при выполнении таски,а так же для подтверждения выкладки
        // либо не войд,а тип того самого сервиса с фотками
    }

    public Collection<Assortment> getAllAssortment() {
        //используем для получения списка ассортимента при мониторинге выкладки и при формировании заказа
        return null;
    }

    public void updateAssortment() {
        // используем при для изменения кол-ва фейсов и формировании заказа
    }

    public Collection<ForeignCompany> getCompetitors() {
        //получаем список основных конкурентов
        return null;
    }

    public void updateForeignCompany() {
        //вносим данные по сторонним конкурентам
    }

    public Collection<RepairTask> getAllRepairTasks() {
        //получаем все заявки по данной точке,находящиеся в ожидании
        return null;
    }

    public void addNewRepairTask() {
        //добавляем новую таску ну и прикладываем фото
    }

    public void saveSingleMagazine() {
        //сохраняем изменение по точке
    }
    //Функцонал по работе с точкой
    /////////////////////////////////////////////

    public KPI getKpiBMagazine() {
    // получаем KPI по магазину
        return null;
    }

    public KPI getTotalKpi(){
        //получаем KPI по всем точкам
        return null;
    }

    public Collection<Promo> getPromo(){
        //получаем список промо,только для чтения
        return null;
    }

}
