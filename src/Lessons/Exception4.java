package Lessons;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

// ������������� ������ �������� ����������
public class Exception4 {
    public static void main(String[] args) {
        try {
            run();
            //  } catch (IOException e) {         ���� �� ����� ���������� ��� ������� ���������,
            //      e.printStackTrace();          �� ���������� ������-catch ����. ����:
            //  } catch (ParseException e) {
            //      e.printStackTrace();
            //  } catch (IllegalAccessException e) {
            //      e.printStackTrace();

      //  } catch (IOException | ParseException | IllegalAccessException e) {
      //      e.printStackTrace();
            // ���������� ����� ���� ����������� ���� �� �����, �� ��� ��� ����������� �� ������-�������� Exeption.
            // ������� �� ����� �������� ��������� ���� ����� ���������� �������� ����:
        } catch (Exception e) { // ����� ���� ��������� ����������, ������ ����� ��������� ����� ���������� ��� ������ ���������, �.�. ��� ������������ � ���� �����.

        }

    }
    public static void run () throws IOException, ParseException, IllegalAccessException {
            // � ����� ������ ����� ��������� ��������� ������ ����������. ���� �� �� �� ���������� � ���� ������, �� ���� �� ���������� � ��� ������ ��� ������� ����� RUN.

    }

}