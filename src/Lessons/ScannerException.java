package Lessons;

public class ScannerException extends Exception {/* �� ��������� ������ "ScannerException" �� ���������� � ��� ���� �������������� �� ������ Exception.
�� ��� ����� ���� ��� ���������� "ScannerException" ������������ � ����� ���������� java ����� Exception2 �
�������� ��� ��� IOException �� ScannerException. */
    public ScannerException(String description) { /* ������ �� ����� �������� ������ � �������� ������ ����������, ������� ����� ���������� ��� ������� ����������.
    ������: throw new ScannerException("������������ ���� ���-�� ����� ����"). ������ ���� ����� ����������� � ������� ������ ��������� */
        super(description);
    }

}
