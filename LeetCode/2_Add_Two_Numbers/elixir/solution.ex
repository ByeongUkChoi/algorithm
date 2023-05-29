# Definition for singly-linked list.
defmodule ListNode do
  @type t :: %__MODULE__{
          val: integer,
          next: ListNode.t() | nil
        }
  defstruct val: 0, next: nil
end

defmodule Solution do
  @spec add_two_numbers(l1 :: ListNode.t() | nil, l2 :: ListNode.t() | nil) :: ListNode.t() | nil
  def add_two_numbers(l1, l2) do
    answer = get_number(l1) + get_number(l2)
    answer |> Integer.digits() |> to_linked_list(nil)
  end

  defp get_number(list) do
    get_number(list, 0, 0)
  end

  defp get_number(nil, value, _digit) do
    value
  end

  defp get_number(list, value, digit) do
    get_number(list.next, value + list.val * 10 ** digit, digit + 1)
  end

  defp to_linked_list([head | tail], next) do
    node = %ListNode{val: head, next: next}
    to_linked_list(tail, node)
  end

  defp to_linked_list([], acc) do
    acc
  end
end
