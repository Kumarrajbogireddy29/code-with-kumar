{
 "cells": [
  {
   "cell_type": "code",
   "execution_count": 2,
   "id": "fd85d881-47c8-4a58-b861-768244c84cd4",
   "metadata": {},
   "outputs": [
    {
     "ename": "SyntaxError",
     "evalue": "invalid syntax (728349862.py, line 1)",
     "output_type": "error",
     "traceback": [
      "\u001b[1;36m  Cell \u001b[1;32mIn[2], line 1\u001b[1;36m\u001b[0m\n\u001b[1;33m    jupyter kernelspec list\u001b[0m\n\u001b[1;37m            ^\u001b[0m\n\u001b[1;31mSyntaxError\u001b[0m\u001b[1;31m:\u001b[0m invalid syntax\n"
     ]
    }
   ],
   "source": [
    "jupyter kernelspec list"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 3,
   "id": "1a397a53-cfc0-43bf-ba6e-538c2dad4941",
   "metadata": {},
   "outputs": [
    {
     "ename": "SyntaxError",
     "evalue": "invalid syntax (3305369356.py, line 1)",
     "output_type": "error",
     "traceback": [
      "\u001b[1;36m  Cell \u001b[1;32mIn[3], line 1\u001b[1;36m\u001b[0m\n\u001b[1;33m    jupyter notebook\u001b[0m\n\u001b[1;37m            ^\u001b[0m\n\u001b[1;31mSyntaxError\u001b[0m\u001b[1;31m:\u001b[0m invalid syntax\n"
     ]
    }
   ],
   "source": [
    "jupyter notebook"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 5,
   "id": "a103be3e-dc86-469e-b76f-a06b683d3dc0",
   "metadata": {},
   "outputs": [
    {
     "ename": "SyntaxError",
     "evalue": "invalid syntax (942565425.py, line 3)",
     "output_type": "error",
     "traceback": [
      "\u001b[1;36m  Cell \u001b[1;32mIn[5], line 3\u001b[1;36m\u001b[0m\n\u001b[1;33m    public class CountDigits {\u001b[0m\n\u001b[1;37m           ^\u001b[0m\n\u001b[1;31mSyntaxError\u001b[0m\u001b[1;31m:\u001b[0m invalid syntax\n"
     ]
    }
   ],
   "source": [
    "import java.util.Scanner;\n",
    "\n",
    "public class CountDigits {\n",
    "    public static void main(String[] args) {  \n",
    "        Scanner sc = new Scanner(System.in);\n",
    "        System.out.println(\"Enter your number\");\n",
    "\n",
    "        int num = sc.nextInt();\n",
    "        num = Math.abs(num); \n",
    "\n",
    "        int count;\n",
    "        if (num == 0) {\n",
    "            count = 1; \n",
    "        } else {\n",
    "            count = 0;\n",
    "            while (num != 0) {\n",
    "                num = num / 10; \n",
    "                count++;       \n",
    "            }\n",
    "        }\n",
    "\n",
    "        System.out.println(\"Number of digits: \" + count);\n",
    "        sc.close();\n",
    "    }\n",
    "}\n"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "a5af7b19-fb23-4e5a-8eaa-2e530e7e34aa",
   "metadata": {},
   "outputs": [],
   "source": []
  }
 ],
 "metadata": {
  "kernelspec": {
   "display_name": "Python 3 (ipykernel)",
   "language": "python",
   "name": "python3"
  },
  "language_info": {
   "codemirror_mode": {
    "name": "ipython",
    "version": 3
   },
   "file_extension": ".py",
   "mimetype": "text/x-python",
   "name": "python",
   "nbconvert_exporter": "python",
   "pygments_lexer": "ipython3",
   "version": "3.12.7"
  }
 },
 "nbformat": 4,
 "nbformat_minor": 5
}
